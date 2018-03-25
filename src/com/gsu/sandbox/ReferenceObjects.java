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
public class ReferenceObjects {
    
    public static void main (String args[]) {
        
        Integer x = new Integer(0);
        Integer y = new Integer(0);
        Integer z = x;
        
        System.out.println ( (x == y) ); // false
        System.out.println ( (x instanceof Integer) ); // compare class : true
        System.out.println ( (x == z) ); // true
        System.out.println ( x.equals(y)); // true
        
        Object[] myArray = new Object[10];
        
        myArray[0] = 1;
        myArray[1] = "ABC";
        
        System.out.println (Arrays.toString(myArray));
        
        
    }
    
}
