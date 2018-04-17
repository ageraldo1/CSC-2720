/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.trees.binarysearch;

/**
 *
 * @author Alexandre
 * @param <T>
 */
public interface Tree<T> {
    
    public enum transversalOrder {
        PRE,
        IN,
        POST
    }
    
    public void transverse(transversalOrder order);
    
    public void insert(T element);
    
    public void remove(T element);
    
    public T max();
    
    public T min();
    
    public int size();
    
    public boolean isEmpty();
    
    public T getRoot();
    
}
