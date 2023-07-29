package com.bhatiya;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Formcontroller {

@RequestMapping("/complex")
	public String showForm()
	{
		return "complexform";
	}


@RequestMapping(path="/handleform", method= RequestMethod.POST)
public String formHandler(@ModelAttribute("studentEntity")StudentEntity studentEntity, BindingResult result)
{
	if(result.hasErrors())
	{
		return "complexform";
	}
	System.out.println(studentEntity);
	return "sucess";
	
}
}
