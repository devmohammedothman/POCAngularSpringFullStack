package com.selftraining.mvn.angularspringmaven.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class welcomeController {

	
	@RequestMapping (value = {"/welcome"} , method = RequestMethod.GET)
	public String welcomepage()
	{
		return "welcome";
	}
	
	@RequestMapping (value = {"/no"} , method = RequestMethod.GET)
	public String dog()
	{
		return "index";
	}
}
