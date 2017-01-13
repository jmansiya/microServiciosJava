package net.jose.mansilla.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import net.jose.mansilla.DTOs.Greeting;
import net.jose.mansilla.service.ClientGreetingService;

@Controller
public class ClientGreetingController {
	
	protected ClientGreetingService helloWordlService;
	
	public ClientGreetingController() {
		super();
	}

	@Autowired
	public ClientGreetingController(ClientGreetingService helloWordlService) {
		super();
		this.helloWordlService = helloWordlService;
	}
	
	@RequestMapping("/greeting")
	public String goHome(){
		return "index";
	}
	
	@RequestMapping("/greeting/{name}")
	public String greeting(Model model, @PathVariable("name") String name) {
		Greeting greeting = helloWordlService.greeting(name);
		
		model.addAttribute("greeting", greeting.getContent());
		
		return "greeting";
	}
}



