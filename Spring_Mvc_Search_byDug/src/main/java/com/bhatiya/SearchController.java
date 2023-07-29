 package com.bhatiya;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userID")int userId)
	{
		System.out.println(userId);
		return "home";
	}
	
	
	
	@RequestMapping("/myhome")
	public String home()
	{
		System.out.println("go to my home page...");
		return "home";
	}
	
	@RequestMapping(name="/search")
	public RedirectView seach(@RequestParam("query")String query)
	{
		String url="https://www.google.com/search?q=www.google.com=" +query;
	RedirectView redirectView=	new RedirectView();
	redirectView.setUrl(url);
	
		return  redirectView;
	}
//handaling exception in our spring mvc
	@ExceptionHandler(value= NullPointerException.class)
	public String exceptionHanderNull(Model m)
	{
		m.addAttribute("msg", "null pointer exception has occured");
		
		return "null_file";
		
	}
	
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHanderNumberFormat(Model m)
	{
		m.addAttribute("msg", "number frormat exception");
		return "null_file";
	}

	@ExceptionHandler(value=Exception.class)
	public String exceptionHanderGenric(Model m)
	{
		m.addAttribute("msg", " exception has occureed");
		return "null_file";
	}
}
