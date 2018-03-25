/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.generic;

import java.util.Random;
import java.util.UUID;


/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        
        runTests(0);
        runTests(1);

    }
    
    public static void printTests(GenericStack stack) {
        final String header="*****************************************************************************************";
        
        System.out.println (header);
        System.out.println ("Stack Size.........: " + stack.size());
        System.out.println ("Expansable Stack...: " + stack.isExpandable());
        System.out.println ("IsFull.............: " + stack.isFull());
        System.out.println ("IsEmpty............: " + stack.isEmpty());
        System.out.println ("Stack Size.........: " + stack.size());
        System.out.println ("Stack content......: " + stack.toString());
        System.out.println ("Peek................:" + stack.peek());
        System.out.println (header);
        
    }
    
    public static void runTests(int testNr) {
        int DEFAULT_SIZE = 10;
        int value;

        Random rand = new Random();

        if ( testNr == 0 ) { // integer
            System.out.println ("Test1 : Integer Stack with max size of " + DEFAULT_SIZE);
            GenericStack<Integer> stack = new Stack<>(DEFAULT_SIZE);

            for ( int i = 0; i < DEFAULT_SIZE; i++) {
                stack.push(rand.nextInt(100));
            }

            printTests(stack);            

            value = rand.nextInt(DEFAULT_SIZE);
            System.out.println ("Removing " + value + " elements from Stack");

            for ( int i = 0; i < value; i++ ) {
                stack.pop();
            }

            printTests(stack);
            stack.popAll();
            
        } else if ( testNr == 1 ) { // String
            System.out.println ("Test2 : String Stack with max size of " + DEFAULT_SIZE);
            GenericStack<String> stack = new Stack<>(DEFAULT_SIZE);

            for ( int i = 0; i < DEFAULT_SIZE; i++) {
                stack.push(UUID.randomUUID().toString().substring(0,8));
            }

            printTests(stack);

            value = rand.nextInt(DEFAULT_SIZE);
            System.out.println ("Removing " + value + " elements from Stack");

            for ( int i = 0; i < value; i++ ) {
                stack.pop();
            }

            printTests(stack);
            
            System.out.println ("Poping all elements");
            stack.popAll();            
            printTests(stack);
        }       
    }
    
}
