/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo;

/**
 *
 * @author Mohammmed Sami
 */
public class FurtuneServiceImp implements FurtuneService{

    @Override
    public String getDailyFurtune() {
        return "Today is your lucky day!";
    }
    
    
}
