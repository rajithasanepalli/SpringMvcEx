package com.mouritech.firstspringmvcapp.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mouritech.firstspringmvcapp.model.Welcome;

@Controller
@RequestMapping("/welcomecontroller")
public class WelcomeController {
	
	@RequestMapping("/saywelcome")
	public String welcomeHandler(Model model) {
		
		Welcome welcome = new Welcome();
		welcome.setMessage("Welcome To Mouritech");
		welcome.setDateTime(LocalDateTime.now().toString());
		//we can access this object in the view
		//we are sending the response to the associated view
		model.addAttribute("welcomeobj", welcome);
		//the above object will be returned to greetings.jsp
		return "welcome";
	}

}
