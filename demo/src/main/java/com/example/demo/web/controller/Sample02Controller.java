package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.web.model.Sample02Form;

@Controller
public class Sample02Controller {

	private String CLASS = "Sample02Controller";
	
	@RequestMapping(value="/Sample02", method=RequestMethod.GET)
	public String doGet(@ModelAttribute Sample02Form form, Model model) {
		String METHOD = "doGet";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample02View";
	}
	
	@RequestMapping(value="/Sample02", method=RequestMethod.POST)
	public String doPost(@ModelAttribute Sample02Form form, Model model) {
		String METHOD = "doPost";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample02View";
	}
}
