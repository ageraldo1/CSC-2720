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
public class Queue {
    
    private ArrayList<Integer> queue;
    
    public Queue() {
        this.queue = new ArrayList<>();
    }
    
    public void enqueue(int element) {
        queue.add(element);
    }
    
    public int dequeue() {
        if ( queue.size() == 0 ) {
            throw new NoSuchElementException();
        }
        
        return queue.remove(0);
    }
    
    public int peek() {
        if ( queue.size() == 0 ) {
            throw new NoSuchElementException();
        }
        
        return queue.get(0);
    }
    
    public int size() {
        return queue.size();
    }
    
    
}
