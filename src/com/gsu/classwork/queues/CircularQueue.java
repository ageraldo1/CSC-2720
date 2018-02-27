/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.queues;

import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class CircularQueue {
    
    private int MAX_QUEUE_SIZE = 5;
    private final double INCREASE_FACTOR = 0.5;
    
    private Object[] queue = new Object[MAX_QUEUE_SIZE];
    
    private int frontIndex;
    private int backIndex;
    private int currentSize;
    private int totalResizes;
    private boolean resize;
    
    
    public CircularQueue () {
        this.frontIndex = 0;
        this.backIndex = MAX_QUEUE_SIZE -1;
        this.currentSize = 0;
        this.totalResizes = 0;
        this.resize = true;
    }
    
    public CircularQueue (boolean resize) {
        this.frontIndex = 0;
        this.backIndex = MAX_QUEUE_SIZE -1;
        this.currentSize = 0;
        this.totalResizes = 0;
        this.resize = resize;
    }    
    
    public boolean isEmpty() {
        return currentSize == 0;
    }
    
    public boolean isFull() {
        return currentSize == MAX_QUEUE_SIZE;
    }
    
    public void add(Object element) throws CircularException {
        
        if ( isFull() ) {
            if ( this.resize == true ) {
                expandQueue();
                
            } else { 
                throw new CircularException("Circular Queue Full");
            }
            
        }
        
        this.backIndex = getNextPosition(this.backIndex);
        queue[this.backIndex] = element;
        this.currentSize++;
    }
    
    public Object remove() {
        Object objFront = null;
        
         if ( !isEmpty() ) {
            objFront = queue[frontIndex];
            queue[frontIndex] = null;
            
            this.frontIndex = getNextPosition(this.frontIndex);
            this.currentSize --;           
        }
         
        return objFront;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
    
    public void showStats() {
        System.out.println ("\tCurrent Size......: " + this.currentSize);
        System.out.println ("\tFront Index.......: " + this.frontIndex);
        System.out.println ("\tBack Index........: " + this.backIndex);
        System.out.println ("\tMax Size..........: " + this.MAX_QUEUE_SIZE);
        System.out.println ("\tIncrease Factor...: " + this.INCREASE_FACTOR);
        System.out.println ("\tTotal Resizes.....: " + this.totalResizes);
        System.out.println ("\tAvailable.........: " + (this.MAX_QUEUE_SIZE - this.currentSize));
    }
    
    public Object peek () {
        Object objQueue = null;
        
        if ( !isEmpty()) {
            objQueue = queue[this.frontIndex];
        }
        
        return objQueue;
    }
    
    private void expandQueue() {
        
        Object[] expandedQueue = new Object[queue.length + ((int)(queue.length * this.INCREASE_FACTOR)) ];
        System.arraycopy(this.queue, 0, expandedQueue, 0, this.queue.length);
        
        this.queue = expandedQueue;        
        this.MAX_QUEUE_SIZE = this.queue.length;      
        this.totalResizes++;
    }
    
    private int getNextPosition(int index) {
        return ( index + 1) % (MAX_QUEUE_SIZE);
    }
    
            
    
            
    
    
    
    
    
}


