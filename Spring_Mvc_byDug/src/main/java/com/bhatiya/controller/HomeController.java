package com.bhatiya.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home1")
	public String home(Model modal)
	{
		System.out.println("this is home url");
		modal.addAttribute("name","chandan bhatiya");
		modal.addAttribute("id",123);
		
		List<String> friends=new ArrayList<String>();
		friends.add("ohit");
		friends.add("kundan");
		friends.add("mukesh");
		modal.addAttribute("f",friends);
		return "index";
	}
	
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is a about page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is a help page");
		ModelAndView modalAndView=new ModelAndView();
		modalAndView.addObject("name", "bhatiya");
		modalAndView.addObject("rollno",12345);
		
		LocalDateTime now=LocalDateTime.now();
		modalAndView.addObject("time", now);
		
		//marks
		List<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(13);
		list.add(15);
		modalAndView.addObject("marks", list);
		
		modalAndView.setViewName("help");
		return modalAndView;
	}
}
