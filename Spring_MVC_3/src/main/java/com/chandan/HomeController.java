package com.chandan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.chandan.entity.User;

@Controller
public class HomeController {
	
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
public  String registerUser(@ModelAttribute User user, @RequestParam("img") String img)
{
	System.out.println("Image name :" +img);
		System.out.println(user.getFullName());
		
		return "register";
}
}
