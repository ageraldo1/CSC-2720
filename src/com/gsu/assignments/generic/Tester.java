/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.generic;

import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        int DEFAULT_SIZE = 5;
        
        GenericStack<Integer> stack = new Stack<>(DEFAULT_SIZE);
        
        printTests(stack);
        
/*        
        Random rand = new Random();
        System.out.println ("Adding " + DEFAULT_SIZE + " randon numbers\n");
        
        for ( int i = 0; i < DEFAULT_SIZE; i++) {
            stack.push(rand.nextInt(100));
        }
        
        System.out.println ("Stack..............:" + stack.toString());
        System.out.println ("Stack Size.........: "  + stack.size());
        System.out.println ("IsFull.............: "  + stack.isFull());
        
        System.out.println("Pop first element...:" + stack.pop());
        System.out.println("Pop second element..:" + stack.pop());
        System.out.println("Peek................:" + stack.peek());
  */


    }
    
    public static void printTests(GenericStack stack) {
        final String header="*****************************************************************************************";
        
        System.out.println (header);
        System.out.println ("Stack Size.........: "  + stack.size());
        System.out.println ("IsFull.............: "  + stack.isFull());
        System.out.println ("IsEmpty............: "  + stack.isEmpty());
        
    }
    
}
