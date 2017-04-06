package com.example.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.web.model.Sample03Form;

@Controller
public class Sample03Controller {

	private String CLASS = "Sample03Controller";
	
	@RequestMapping(value="/Sample03", method=RequestMethod.GET)
	public String doGet(@ModelAttribute Sample03Form form, Model model) {
		String METHOD = "doGet";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample03View";
	}
	
	@RequestMapping(value="/Sample03", method=RequestMethod.POST)
	@ResponseBody
	public String[] doPost(@RequestBody String json) {
		String METHOD = "doPost";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": " + json);
		String[] namelist = new String[]{"imamura", "tanaka", "suzuki"};
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return namelist;
	}
}
