package com.spring.mvc.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HomeController {
	
	@RequestMapping("/home1")
public String home(Model m)
{
		m.addAttribute("name", "chandan");
		m.addAttribute("roll", "101");
		
		List<String> list=new ArrayList<String>();
		list.add("chandu");
		list.add("rama");
		list.add("raja");
		m.addAttribute("nameList", list);
	return "home";
}
	@RequestMapping(path ="/login",method=RequestMethod.GET)
	public ModelAndView login()
	{
		ModelAndView model=new ModelAndView();
		model.addObject("className", "12th class");
		model.addObject("regNum", 238690);
		model.setViewName("login");
		
		List<String> list=new ArrayList<String>();
		list.add("chandu");
		list.add("rama");
		list.add("raja");
		model.addObject("nameList", list);

		model.setViewName("login");
		return model ;
	}
	@RequestMapping(name ="/register",method=RequestMethod.POST)
	public String register() {
		
		
		return "";
	}
	
}
