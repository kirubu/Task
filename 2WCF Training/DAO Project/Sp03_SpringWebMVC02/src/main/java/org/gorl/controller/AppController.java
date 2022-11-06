package org.gorl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController 
{
	@RequestMapping("/sayHi")
	public ModelAndView getWelcomeMsg()
	{
		ModelAndView view = new ModelAndView("welcome");
		return view;
	}
}
