package net.jose.mansilla.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientGreetingHomeController{
	
	
	
	public ClientGreetingHomeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@RequestMapping("/")
	public String home(){
		return "index";
	}
}
