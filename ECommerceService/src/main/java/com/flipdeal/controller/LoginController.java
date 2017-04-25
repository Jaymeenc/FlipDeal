package com.flipdeal.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipdeal.service.AuthenticationDataService;
import com.flipdeal.service.impl.AuthenticationDataServiceImpl;

@RestController
public class LoginController {
	
	AuthenticationDataService service;
	@RequestMapping("/doLogin")
    public boolean doLogin(@RequestBody String user) {   
		String[] userarray=user.split("~");
		String username=userarray[0];
		String pass=userarray[1];
		service= new AuthenticationDataServiceImpl();
    	boolean rs=service.doLogin(username, pass);
    	  
    	     return rs;       	 
	        
    }

}
