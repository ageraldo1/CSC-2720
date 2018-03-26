/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.abstraction;

/**
 *
 * @author Alexandre
 */
public class Player extends GameObject {

    @Override
    public void draw() {
        System.out.println ("Player draw routine");
    }
    
    @Override
    public void about() {
        
        System.out.println ("About Player");
        
    }
    
    
}
