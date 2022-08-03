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
public class MainForLiteralInjection {
    
    public static void main(String[] args){
        
        //Load Application context
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com\\luv2code\\springdemo\\applicationContext.xml");
        
        //get the specified bean
        FootballCoatch coach = context.getBean("football" , FootballCoatch.class);
        
        //print the data of the bean 
        
        System.out.println(coach.getDailyFurtune());
        System.out.println(coach.getDailyWorkout());
        System.out.println("Email : " + coach.getEmailAddress());
        System.out.println("Team : " + coach.getTeam());
        
        //close the context
        context.close();
        
    }
}
