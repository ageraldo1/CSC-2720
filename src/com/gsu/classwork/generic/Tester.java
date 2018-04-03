/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.generic;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        GenericBook<String> first = new GenericBook<>(2010, "First book");
        GenericBook<Integer> second = new GenericBook<>(2017);
        
        System.out.println ("First book......:" + first);
        first.setData("First book data changed");
        System.out.println ("First book......:" + first);
        System.out.println ("Second book.....:" + second);
        
        first.process(second);
        second.process(first);
        
        first.testMethod(second);
        
        
    }
    
}
