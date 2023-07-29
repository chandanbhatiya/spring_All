package com.chandan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chandan.entity.User;
import com.chandan.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService UserService;
	
	
	@RequestMapping("/home")
	public String home()
	{
		
		
		return "home";
	}
	
	@RequestMapping("/register")
	public String register()
	{
		
		
		return "register";
	}
	
	@RequestMapping(path="/createUser",method=RequestMethod.POST)
public  String registerUser(@ModelAttribute User user, @RequestParam("img") String img, Model m)
{
		
		user.setImage(img);
		UserService.registereUser(user);
		m.addAttribute("user",user);
		
	/*	return " redirect:/register";*/
		return "successfully";
}

	
}
