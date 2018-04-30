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
public class Sandbox {
    public static void main(String[] args) {
        System.out.println ('a' + 'b');
        System.out.println ("a" + "b");
        System.out.println ('a' + "b");
        System.out.println ("a" + 'b');
        
        int a[] = new int[10];
        
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[9] = 10;
        System.out.println (a.length);
        System.out.println (Arrays.toString(a));
        
        // remove item 1
        int removeIndex = 4;
        
        for ( int i = removeIndex; i < a.length -1; i++) {
            
            a[i] = a[i+1];
        }
        
        System.out.println (Arrays.toString(a));
    }
    
    public int fibonacci(int n) {
        if ( n <= 2 ) { 
           return 1;

        } else { 
            return  fibonacci(n -1) + fibonacci(n -2);
        }
        
    }
}
