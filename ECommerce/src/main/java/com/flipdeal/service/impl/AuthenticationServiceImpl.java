package com.flipdeal.service.impl;

import org.springframework.web.client.RestTemplate;

import com.flipdeal.service.AuthenticationService;

public class AuthenticationServiceImpl implements AuthenticationService {
RestTemplate rs=new RestTemplate();
	
	@Override
	public boolean doLogin(String username, String pass) {
		
		return (boolean)rs.postForObject("http://localhost:8085/doLogin", username+"~"+pass, boolean.class);
	}

	@Override
	public boolean doRegister(String username, String pass) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
