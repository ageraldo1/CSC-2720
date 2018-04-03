/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.help;

/**
 *
 * @author Alexandre
 */

public class TesterClass {
    
        public static void main (String[] args){
   GenericStack mystack = new GenericStack();
	
		System.out.println(mystack.isEmpty());
		System.out.println(mystack.isFull());
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);
		mystack.push(5);
		mystack.pop();
		
		mystack.print();
		System.out.println(mystack.peek());
                
        }
	
    
}
		
		
		