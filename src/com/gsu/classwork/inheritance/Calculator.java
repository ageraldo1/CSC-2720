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
public class Calculator {
    
    public Calculator() {
        super();
        System.out.println ("In Calculator constructor");
    }
    public int add (int first, int second) {
        return (first + second);
    }
    
}
