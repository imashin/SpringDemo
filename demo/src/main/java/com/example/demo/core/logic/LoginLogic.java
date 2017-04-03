package com.example.demo.core.logic;

import org.springframework.stereotype.Service;

import com.example.demo.core.bean.LoginSessionBean;

@Service
public class LoginLogic {

	public LoginSessionBean login(String username, String passwd) {
		LoginSessionBean loginSessionBean = new LoginSessionBean();
		loginSessionBean.setUsername(username);
		return loginSessionBean;
	}
}
