package com.example.demo.web.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.core.bean.LoginSessionBean;

public class RequestInterceptor implements HandlerInterceptor {

	private String CLASS = "RequestInterceptor";

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String METHOD = "preHandle";
		System.out.println(CLASS + " : " + METHOD + ": ### START　###");
		HttpSession session = request.getSession();
		LoginSessionBean loginSessionBean = (LoginSessionBean) session.getAttribute("LoginSession");
		if (loginSessionBean == null) {
			System.out.println(CLASS + " : " + METHOD + ": LoginSesion is NULL");
			System.out.println(CLASS + " : " + METHOD + ": Redirect to Login !!");
			session.setAttribute("RequestURI", request.getRequestURI());
			response.sendRedirect(request.getContextPath() + "/Login");
			return false;
		}
		System.out.println(CLASS + " : " + METHOD + ": ###　END　###");
		return true;
	}

}
