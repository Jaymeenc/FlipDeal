package com.example;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MeetingConfig
{
    @Bean(name="ceo")
    public Member getCeo(){
        return new CEO();
    }
    
    @Bean(name="cto")
    public Member getCto(){
        return new CTO();
    }
    
    @Bean(name="meetingWithCEO") 
    public Meeting meetingWithCEO(){
    	 return new Meeting(getCeo());
    }
    
    @Bean(name="meetingWithCTO") 
    public Meeting meetingWithCTO(){
        return new Meeting(getCto());
    }
    
}
