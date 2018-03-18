/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.stack;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
     public static void main (String args[]) {
         
         Stack stack = new Stack();   
        
         System.out.println("********************************************");
         System.out.println("Stack Size.........: " + stack.size());
         System.out.println("IsEmpty............: " + stack.isEmpty());
         
         stack.push(1);
         stack.push(2);
         stack.push(3);
         
         System.out.println("Stack Size.........: " + stack.size());
         System.out.println("IsEmpty............: " + stack.isEmpty());
         System.out.println("Stack..............: " + stack.toString());
         
         stack.pop();
         
         
         System.out.println("Stack..............: " + stack.toString());
         System.out.println("Peek...............: " + stack.peek());
         
         stack.push(4);
         stack.push(5);
         stack.push(6);
         System.out.println("Stack..............: " + stack.toString());
         System.out.println("IsFull.............: " + stack.isFull());

         stack.push(7);
         stack.push(8);
         stack.push(9);
         System.out.println("Stack..............: " + stack.toString());         
         
         System.out.println("********************************************");
         
     }
    
}
