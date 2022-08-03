/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springtask;

import com.luv2code.springdemo.*;
import java.util.Random;

/**
 *
 * @author Mohammmed Sami
 */
public class FurtuneServiceImp implements FurtuneService{

    
    String[] randomFurtune = new String[] {"Today is you lucky day!" , "Come on, you can do it!" , "Yohoo, You're the best!"};
    Random random ;
    
    
    @Override
    public String getDailyFurtune() {
        
        int n = (int) (Math.random() * 3);
        
        return randomFurtune[n];
        
        
    }
    
    
}
