/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox.list;

import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 *
 * @author Alexandre
 */
public class Stack {
    
    private ArrayList<Integer> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public int pop() {
        
        if ( stack.size() == 0 ) {
            throw new NoSuchElementException();
        }
        
        return stack.remove(stack.size() -1);
    }
    
    public void push(int element) {
        stack.add(element);
    }
    
    public int peek() {
        if ( stack.size() == 0 ) {
            throw new NoSuchElementException();
        }        
        
        return stack.get(stack.size() -1);
    }
    
    
    
    
}
