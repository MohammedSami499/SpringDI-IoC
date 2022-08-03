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
public class CricketCoach implements Coach{

    private FurtuneService furtuneService;
    
    public void setFurtuneService(FurtuneService furtuneService) {
        this.furtuneService = furtuneService;
    }

    
    @Override
    public String getDailyWorkout() {
        return "Train for 45 on how to shoot ball!";
    }

    @Override
    public String getDailyFurtune() {
      return  furtuneService.getDailyFurtune();
    }



}
