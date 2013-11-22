package com.easy.oil.controller;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import com.easy.oil.data.UserRepository;
import com.easy.oil.data.User;
import com.easy.oil.data.BeanConfiguration;
import com.easy.oil.data.News;

@Controller
public class HelloController {
		
		//db connection propreties
	  AbstractApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
	  UserRepository repository = context.getBean(UserRepository.class);
//logging page login request come to this page
	   @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView user() {
	      return new ModelAndView("login", "command", new Reader()); // model name = "command"
	      
	   }

// pass_word user_name come to this method
	   @RequestMapping(value = "/admin_user", method = RequestMethod.POST)
	   public ModelAndView logUser(@ModelAttribute("SpringWeb")Reader reader, 
	   ModelMap model) {
	      //DB check must goes under here
		   Iterable<User> users = repository.findAll();
		   for (Object user : users) {
				User cc = (User) user;
				if (cc.getUsername().equals(reader.getName()) && cc.getPassword().equals(reader.getPass())){
					if(cc.getAdmin()==true ){
						return new ModelAndView("news_post", "command", new News_post());//post view
					}else{
						ModelAndView r_model = new ModelAndView("news_view");
						/*r_model.addObject("msg", Ne);
						 * 
						 * news head line content  / author must add 
						 * 
						 */
						return r_model;
					}								
				}				
			}
	      //if not in db return user login (with error)
		  return new ModelAndView("login", "command", new Reader());
	   }
	   
//after write pass word and 
}