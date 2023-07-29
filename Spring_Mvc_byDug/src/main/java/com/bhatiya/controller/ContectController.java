package com.bhatiya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhatiya.model.User;
import com.bhatiya.service.UserService;

@Controller
public class ContectController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/contect")
	public String showForm(Model m)
	
	{
		m.addAttribute("Header", "learn spring");
		m.addAttribute("Desc","Home for Programer");
		return "contect";
	}

	//method 2
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
			
	{
		System.out.println(user);
		
		model.addAttribute("Header", "learn spring");
		model.addAttribute("Desc","Home for Programer");
		model.addAttribute("user", user);
		
		int createUser=this.userService.createUser(user);
		
		model.addAttribute("msg","User create with id"+createUser);
		return "success"; 
	}
	
	//method 1
	/*@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email" ) String userEmail,
			@RequestParam("userName") String userName,
			@RequestParam("password") String userPassword, Model model)
	{
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		System.out.println(user);
		
		//System.out.println("user email" +userEmail);
		//System.out.println("user name" +userName);
		//System.out.println("user password" +userPassword);
		
		//model.addAttribute("email", userEmail);
		///model.addAttribute("userName", userName);
		//model.addAttribute("password",userPassword);
		model.addAttribute("user", user);
		
		return "success"; 
	}
	*/
}
