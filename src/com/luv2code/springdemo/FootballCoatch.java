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
public class FootballCoatch implements Coach{
    
    private String emailAddress;
    private String team;
    private FurtuneService service;

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setService(FurtuneService service) {
        this.service = service;
    }

    
    
    @Override
    public String getDailyWorkout() {
        return "Train for shooting for 15 minuts!";
    }

    @Override
    public String getDailyFurtune() {
        return "Yeahhh!,,, Go on, Score some goals! ";
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getTeam() {
        return team;
    }
    
    
    
}
