/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.inheritance;

/**
 *
 * @author Alexandre
 */
public class AdvancedCalculator extends Calculator{
    
    
    public AdvancedCalculator() {
        super();
        System.out.println ("In AdvancedCalculator constructor");
    }   
    
    
    public int sub(int first, int second) {
        return (first - second);
    }
}
