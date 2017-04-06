package com.example.demo.web.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.web.model.Sample01Data;
import com.example.demo.web.model.Sample01DataList;
import com.example.demo.web.model.Sample01Form;

@Controller
public class Sample01Controller {

	private String CLASS = "Sample01Controller";
	
	@RequestMapping(value="/Sample01", method=RequestMethod.GET)
	public String doGet(Model model) {
		String METHOD = "doGet";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		
		String[] namelist = new String[]{"imamura", "tanaka", "suzuki"};
		Sample01DataList sample01DataList = new Sample01DataList();
		List<Sample01Data> dataList = new ArrayList<Sample01Data>();
		for (int i = 0; i < namelist.length; i++) {
			Sample01Data data = new Sample01Data();
			data.setId(String.valueOf(i));
			data.setName(namelist[i]);
			dataList.add(data);
		}
		sample01DataList.setDataList(dataList);
		model.addAttribute("sample01DataList", sample01DataList);
		
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample01View";
	}
	
	@RequestMapping(value="/Sample01", method=RequestMethod.POST)
	public String doPost(@ModelAttribute Sample01Form form, Model model) {
		String METHOD = "doPost";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "Sample01View";
	}
}
