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
	   /*   model.addAttribute("name", reader.getName());
	      model.addAttribute("password", reader.getPass()); */
	      //DB check must goes under here
		   Iterable<User> users = repository.findAll();new ModelAndView("login", "command", new Reader());
		   for (Object user : users) {
				User cc = (User) user;
				if (cc.getUsername()==reader.getName() && cc.getPassword()== reader.getPass()){
					if(cc.getAdmin()==true ){
						return new ModelAndView("news_post", "command", new News());
					}else{
						//return user view
					}								
				}				
			}
	      //if not in db return user login
		  return new ModelAndView("login", "command", new Reader());
	   }
	   
//after write pass word and 
}