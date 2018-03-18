/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.stack;

import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class Stack {
    
    private int capacity = 5;
    private final int CAPACITY_FACTOR=2;
    
    private Object[] stack = new Object[capacity];
    private int currentSize;
    
    public Stack() {
        this.currentSize = 0;
    }
    
    public int size() {
        return this.currentSize;
    }
    
    public boolean isEmpty() { 
        return this.currentSize == 0;
    }
    
    public boolean isFull() { 
        return this.currentSize == this.capacity;
    }
    
    public void push(Object element) {
        if ( isFull() ) {
            expand();
        }
        
        stack[this.currentSize] = element;
        this.currentSize++;
    }
    
    public Object pop() {
        Object element = null;
        
        if ( isEmpty () == false) {
            element = stack[this.currentSize -1];        
            
            stack[this.currentSize -1] = null;
            this.currentSize--;            
        }
        
        return element;
    }
    
    
    public Object peek() { 
        Object element = null;
        
        if ( isEmpty() == false ) {
            element = stack[this.currentSize-1];
        }
        
        return element;
    }
    
    @Override
    public String toString() {
       return Arrays.toString(stack);
    }   
    
    private void expand() {
        int newCapacity = this.capacity * this.CAPACITY_FACTOR;
        
        Object newStack[] = new Object[newCapacity];
        System.arraycopy(this.stack, 0, newStack, 0, this.size());
        
        stack = newStack;        
        this.capacity = newCapacity;        
    }
}
