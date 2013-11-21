package com.easy.oil.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;


@Controller
public class HelloController {
	
	
//logging page login request come to this page
	   @RequestMapping(value = "/login", method = RequestMethod.GET)
	   public ModelAndView user() {
	      return new ModelAndView("login", "command", new Reader()); // model name = "command"
	      
	   }

// pass_word user_name come to this method
	   @RequestMapping(value = "/admin_user", method = RequestMethod.POST)
	   public ModelAndView logUser(@ModelAttribute("SpringWeb")Reader reader, 
	   ModelMap model) {
	      model.addAttribute("name", reader.getName());
	      model.addAttribute("password", reader.getPass()); 
	      //DB check must goes under here
	      //if user
	      //return "news_view";
	      //if admin
	     // 
	      return new ModelAndView("news_post", "command", new News());
	   }
	   
//after write pass word and 
}