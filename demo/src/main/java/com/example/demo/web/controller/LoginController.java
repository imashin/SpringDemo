package com.example.demo.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.core.bean.LoginSessionBean;
import com.example.demo.core.logic.LoginLogic;
import com.example.demo.web.model.LoginForm;

@Controller
public class LoginController {

	private String CLASS = "LoginController";
	
	@Autowired
	LoginLogic loginLogic;
	
	@RequestMapping(value="/Login", method=RequestMethod.GET)
	public String doGet(@ModelAttribute LoginForm form, Model model) {
		String METHOD = "doGet";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "LoginView";
	}
	
	@RequestMapping(value="/Login", method=RequestMethod.POST)
	public String doPost(HttpServletRequest request, @ModelAttribute LoginForm form, Model model) {
		String METHOD = "doPost";
		System.out.println(CLASS + " : " + METHOD + ": ### START ###");
		System.out.println(CLASS + " : " + METHOD + ": " + form.toString());

		// サービス呼び出し
		LoginSessionBean loginSessionBean = loginLogic.login(form.getUsername(), form.getPasswd());
		
		// セッションにログイン情報を格納
		request.getSession().setAttribute("LoginSession", loginSessionBean);

		// リダイレクト先を取得
		String requestURI = (String) request.getSession().getAttribute("RequestURI");
		requestURI = requestURI.replace(request.getContextPath(), "");
		System.out.println(CLASS + " : " + METHOD + ": requestURI=" + requestURI);

		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return "redirect:" + requestURI;
	}
}
