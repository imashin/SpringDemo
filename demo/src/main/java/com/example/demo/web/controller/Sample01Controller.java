package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.web.model.Sample01Form;

@Controller
public class Sample01Controller {

	private String CLASS = "Sample01Controller";
	
	@RequestMapping(value="/Sample01", method=RequestMethod.GET)
	public String doGet(@ModelAttribute Sample01Form form, Model model) {
		String METHOD = "doGet";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample01View";
	}
	
	@RequestMapping(value="/Sample01", method=RequestMethod.POST)
	@ResponseBody
	public String doPost(@ModelAttribute Sample01Form form, Model model) {
		String METHOD = "doPost";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample01View";
	}
}
