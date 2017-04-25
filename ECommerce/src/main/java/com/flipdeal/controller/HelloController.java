package com.flipdeal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flipdeal.service.AuthenticationService;
import com.flipdeal.service.impl.AuthenticationServiceImpl;

@Controller
public class HelloController {
	
	AuthenticationService service;

    @RequestMapping("/")
    public String index() {
        return "Login";
    }
    
    @RequestMapping("/doLogin")
    public String doLogin(@RequestParam("username") String username,@RequestParam("pass") String pass ,ModelMap model) {    	
    	service= new AuthenticationServiceImpl();
    	boolean rs=service.doLogin(username, pass);
    	  
    	      if(rs){
    	      	model.addAttribute("username", " "+ username +"!!!!!!");
    	      	 return "Home";
    	      }
    	      else{
    	    	  model.addAttribute("errorMsg", "Error Occured");
    	    	  return "Login";
    	      }   	       	 
	        
    }

}
