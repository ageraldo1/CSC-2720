/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox;

import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class TesterTrash {
    
    public static void main(String args[]) {
        Trash<String> t = new Trash<>("Test 123");
        Trash<Integer> c = new Trash(123);
        
        String value = t.getData();
        int value2 = c.getData();
        
        System.out.println (value);
        System.out.println (value2);
        
        
        Object [] stack = new Object[3];
        
        stack[0] = 1;
        stack[1] = 1;
        stack[2] = 1;
        
        System.out.println (Arrays.toString(stack));
        
        
        

    }
            
}
