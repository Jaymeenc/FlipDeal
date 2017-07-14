package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ResolveDesignIssueApplication {


    public static void main(String[] args)
    {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(MeetingConfig.class);
        Meeting revenueMeeting=(Meeting)ctx.getBean("meetingWithCEO");
        revenueMeeting.discuss();
        Meeting techMeeting=(Meeting)ctx.getBean("meetingWithCTO");
        techMeeting.discuss();
        
        
    }
}
