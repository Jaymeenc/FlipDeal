package com.flipdeal.service;

public interface AuthenticationService {
	
	public boolean doLogin(String username,String pass);
	public boolean doRegister(String username,String pass);

}
