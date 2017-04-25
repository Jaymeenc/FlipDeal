package com.flipdeal.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.flipdeal.service.AuthenticationDataService;

public class AuthenticationDataServiceImpl implements AuthenticationDataService {

	@Override
	public boolean doLogin(String username, String pass) {
		final String DB_URL = "jdbc:h2:~/test";

 	   Connection conn = null;
 	   Statement stmt = null;
 	   try{
 	      //STEP 2: Register JDBC driver
 	      Class.forName("org.h2.Driver");

 	      //STEP 3: Open a connection 	
 	      conn = DriverManager.getConnection(DB_URL,"sa","");

 	      //STEP 4: Execute a query 
 	      stmt = conn.createStatement();
 	      String sql;
 	      sql = "SELECT username, password FROM login where username='"+username+"' and password='"+pass+"'";
 	      
 	      ResultSet rs = stmt.executeQuery(sql);
 	      
 	     if(rs.next()){ 	     
 	      	 return true;
 	      }
 	      else{
 	    	 return false;
 	      }
 	     }catch(Exception e){
   		   
   	   }
	return false;
	}

	@Override
	public boolean doRegister(String username, String pass) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
