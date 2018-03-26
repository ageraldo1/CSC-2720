/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.generic;

import java.util.Arrays;


/**
 *
 * @author Alexandre
 * @param <E>
 */
public class Stack<E> implements GenericStack<E>  {

    private final int DEFAULT_SIZE=10;
    private final int CAPACITY_FACTOR=2;
    
    private E elements[];

    private int top;
    private boolean expand;
    
    public Stack() {
        this.top = -1;
        this.elements = (E[]) new Object[this.DEFAULT_SIZE];
        this.expand = false;
    }

    public Stack(int size) {
        this.top = -1;
        this.elements = (E[]) new Object[size];
        this.expand = false;
    }

    public Stack(boolean expandable) {
        this.top = -1;
        this.elements = (E[]) new Object[this.DEFAULT_SIZE];
        this.expand = expandable;
    }
    
    
    @Override
    public boolean isEmpty() {
        return ( top == -1);
    }

    @Override
    public boolean isFull() {
        return ( this.top == (this.elements.length -1));
    }

    @Override
    public E peek() {
        E element = null;
        
        if (isEmpty () == false) {
            element = this.elements[this.top];
        }
        
        return element;        
    }

    @Override
    public E pop() {
        E element = null;
        
        if (isEmpty () == false) {
            element = this.elements[this.top];
            this.elements[this.top] = null;
            
            this.top--;
        }
        
        return element;
    }

    @Override
    public void push(E element) {
        if ( isFull () ) {
            if ( this.expand == false ) {
                throw new IndexOutOfBoundsException("Stack is full"); 
                
            } else { 
                expand();
            }
        }
        
        elements[++this.top] = element;
    }

    @Override
    public int size() {
        return this.top;
    }

    private void expand() {
        int newCapacity = this.elements.length * this.CAPACITY_FACTOR;
        E newStack[] = (E[]) new Object[newCapacity];
        
        System.arraycopy(this.elements, 0, newStack, 0, this.elements.length);
        this.elements = newStack;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    @Override
    public boolean isExpandable() {
        return this.expand;
    }

    @Override
    public void popAll() {
        while ( this.isEmpty() == false) {
            this.pop();
        }
    }
    
}
