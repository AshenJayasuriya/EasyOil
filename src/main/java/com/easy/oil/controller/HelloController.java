package com.easy.oil.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.codec.digest.DigestUtils;
import org.hibernate.mapping.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easy.oil.data.Currency;
import com.easy.oil.data.CurrencyRepository;

//import com.easy.oil.data.CurrencyRepository;
import com.easy.oil.data.NewsRepository;
import com.easy.oil.data.StdUserRepository;
import com.easy.oil.data.StdUser;
import com.easy.oil.data.BeanConfiguration;
import com.easy.oil.data.News;

import java.sql.Timestamp;
import java.util.Date;

@Controller
@SessionAttributes("session_u_id")
public class HelloController {

	// db connection propreties

	private AbstractApplicationContext context = new AnnotationConfigApplicationContext(
			BeanConfiguration.class);
	private StdUserRepository repository = context
			.getBean(StdUserRepository.class);
	private NewsRepository news_repo = context.getBean(NewsRepository.class);
	private CurrencyRepository currency_rate = context
			.getBean(CurrencyRepository.class);
	private String db_uid;
	private Map mp;
	private String submit_u_id;
	private Date date;

	// logging page login request come to this page
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView user() {
		ModelAndView nlog = new ModelAndView("login", "command", new Reader()); // model
																				// name
																				// =
																				// "command"
		nlog.addObject("session_u_id", "not_allow");
		return new ModelAndView("login", "command", new Reader()); // model name
																	// =
																	// "command"
	}

	// pass_word user_name come to this method
	@RequestMapping(value = "/admin_user", method = RequestMethod.POST)
	public ModelAndView logUser(Reader reader) {
		// DB check must goes under here
		// repository.fi
		Iterable<StdUser> users = repository.findAll();
		for (Object obj : users) {
			StdUser cc = (StdUser) obj;
			if (cc.getUsername().equals(reader.getName())
					&& cc.getPassword().equals(
							DigestUtils.md5Hex(reader.getPass()))) {
				// System.out.println(reader.getName() + cc.getUsername() );
				if (cc.isAdministrator() == true) {
					ModelAndView amv = new ModelAndView("news_post", "command",
							new News_post());
					db_uid = String.valueOf(cc.getUser_id());
					amv.addObject("currency_type",
					get_user_currency_name(cc.getCurrency()));
					amv.addObject("session_u_id", db_uid);
					return amv;// post view
				} else {
					ModelAndView r_model = new ModelAndView("news_view");
					News lastPosted = getLatestNews();

					r_model.addObject("currency_type", get_user_currency_name(cc.getCurrency()));
					r_model.addObject("user_name", cc.getUsername());

					r_model.addObject("headline", lastPosted.getHeadline());
					r_model.addObject("content", lastPosted.getContent());
					double conv_cost = convertvalue(cc.getCurrency(),
							Long.parseLong(lastPosted.getUser_id()),
							lastPosted.getCost());
					r_model.addObject("cost", conv_cost);
					return r_model;
				}
			}
		}
		// if not in db return user login (with error)
		return new ModelAndView("login", "command", new Reader());
	}

	// commeting new news
	@RequestMapping(value = "/news_posted", method = RequestMethod.POST)
	public ModelAndView postAdmin(News_post np, Model model, HttpSession session) {
		date = new Date();
		try {
			// String uuid = session.get
			mp = model.asMap();
			submit_u_id = (String) mp.get("session_u_id");
			news_repo.save(new News(submit_u_id, np.getTitle(), np.getBody(),
					np.getPrice(), (new Timestamp(date.getTime()))));
			// repository.save(new StdUser("John",
			// "Smith","jsmith","johnsmith@gmail.com", "abc123", false, "USD"));
			session.invalidate();
		} catch (Exception e) {

		} finally {

		}
		return new ModelAndView("thank_you");
	}

	private News getLatestNews() {
		//List last  = (List) news_repo.latest();
		News lastPosted = news_repo.latest();
		/*Timestamp last;
		News lastPrevious;
		Timestamp previous;
		Iterable<News> newsList = news_repo.findAll();
		int i = 0;
		for (News news : newsList) {
			if (i < 1)
				lastPosted = news;
			else {
				lastPrevious = lastPosted;
				lastPosted = news;
				previous = lastPrevious.getTimestamp();
				last = lastPosted.getTimestamp();
				if (last.before(previous)) {
					lastPosted = lastPrevious;
					lastPrevious = news;
				}
			}
		}*/
		//News nn = (News)last;
		return lastPosted;
	}

	private double convertvalue(int user_currency_id, long adnim_id, double cost) {
		double one_usd_admin = currency_rate.findOne(
				get_user_currency_id(adnim_id)).getUsd_value();
		double one_usd_user = currency_rate.findOne(user_currency_id)
				.getUsd_value();
		double convert_value = (cost / one_usd_admin) * one_usd_user;
		return convert_value;
	}

	private String get_user_currency_name(int currency_id) {
		return currency_rate.findOne(currency_id).getType();
	}

	private int get_user_currency_id(long user_id) {
		return repository.findOne(user_id).getCurrency();
	}
}
