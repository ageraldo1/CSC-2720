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
public class SuperCalculator extends AdvancedCalculator {
    
    public SuperCalculator() {
        super();
        System.out.println ("In SuperCalculator constructor");
    }
    
    public SuperCalculator(boolean value) {
        System.out.println ("In SuperCalculator...: " + value);
    }
    public int multi(int first, int second) {
        return ( first * second);
    }
    
}
