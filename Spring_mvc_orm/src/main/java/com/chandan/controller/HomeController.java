package com.chandan.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import com.chandan.entity.User;
import com.chandan.service.UserService;
@Controller
public class HomeController {

	
	private UserService userService;
	
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
		
	userService.saveUser(user);
		return "successfully";
}
	@RequestMapping(path="/google")
	public String redirectPage()
	{
		return "redirect:https://www.google.com";
	}
	@RequestMapping(path="/yahoo")
	public RedirectView redirectView() {
		RedirectView redirect=new RedirectView();
		redirect.setUrl("https://in.search.yahoo.com/");
		return redirect;
	}
	@RequestMapping(path="/search",method=RequestMethod.POST)
	public String search(@RequestParam("keybord") String keybord)
	{
		String url="https://www.google.com/search?q="+keybord;
		
		return "redirect:"+url;
	}
	
	@RequestMapping(path="/user{id}")
	public String demo(@PathVariable ("id") int id ,@PathVariable String name)
	{
		System.out.println("id"+id);
		System.out.println("name"+name);
		return "home";
	}
}
