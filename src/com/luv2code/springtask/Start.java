/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springtask;

import com.luv2code.springdemo.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Mohammmed Sami
 */

public class Start {
    public static void main(String[] args){
        ClassPathXmlApplicationContext path = new ClassPathXmlApplicationContext("com\\luv2code\\springtask\\applicationContext.xml");
            Coach c =  path.getBean("track" , Coach.class);
            
            
            System.out.println(c.getDailyWorkout());
            System.out.println(c.getDailyFurtune());
            
    }
}
