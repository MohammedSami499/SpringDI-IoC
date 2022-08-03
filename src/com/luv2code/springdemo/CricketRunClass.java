/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mohammmed Sami
 */
public class CricketRunClass {
    public static void main(String[] args){
        //Load configuration from applicationContext.xml
        ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\applicationContext.xml");
        
        //get the required bean
        Coach coach = context.getBean("cricket" , Coach.class); 
        
        //print out the message
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFurtune());
        
        
        //close the configuration file
        context.close();
    }
}
