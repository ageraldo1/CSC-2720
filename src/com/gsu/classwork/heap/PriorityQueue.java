/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.heap;

import java.util.Queue;

/**
 *
 * @author Alexandre
 */
public class PriorityQueue<T extends Comparable>  {
    GenericHeap<T> queue;
    
    public PriorityQueue() {
        this.queue = new GenericHeap<>();
    }
    
    public void add(T element) {
        this.queue.insert(element);
    }
    
    public void clear() {
        while ( !this.queue.isEmpty()) {
            this.queue.remove();
        }
    }
    
    public T peek() {
        return this.queue.getTop();
    }
    
    public T remove() {
        return this.queue.remove();
    }
    
    public int size() {
        return this.queue.size();
    }
    
    public boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
    public String toString() {
        return this.queue.toString();
    }
    
    
}
