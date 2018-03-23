/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.generic;

/**
 *
 * @author Alexandre
 * @param <E> Stack element
 */
public interface GenericStack<E> {
    
    public boolean isEmpty();
    
    public boolean isFull();
    
    public E peek();
    
    public E pop();
    
    public void push(E element);
    
    public int size();
    
    @Override
    public String toString();
    
}
