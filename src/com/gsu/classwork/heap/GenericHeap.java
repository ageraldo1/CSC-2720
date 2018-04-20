/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Alexandre
 * @param <T>
 */
public class GenericHeap<T extends Comparable> {
    
    private List<T> heap;
    
    public GenericHeap() {
        this.heap = new ArrayList<>();
    }
    
    public int size() { 
        return ( heap.size());
    }
    
    private void moveUp() {
        T parentNode  = null;
        T currentNode = null;
        
        int index       = this.heap.size() -1; // always start from the last node
        int parentIndex;
        
        
        while ( index > 0 ) {
            parentIndex = ( index -1) / 2;    // integer division ( no decimals )
            currentNode = this.heap.get(index);
            parentNode  = this.heap.get(parentIndex);
            
            if ( currentNode.compareTo(parentNode) > 0) { // currentNode is greater than its parent
                this.heap.set(index, parentNode);
                this.heap.set(parentIndex, currentNode);
                
                index = parentIndex;
                
            } else {
                break;
            }
        }        
    }
    
    private void moveDown() {
        int index  = 0;                    // start from root node
        int left   = ( 2 * index ) + 1;    // left child
        int max;
        int right;
        
        T swap;
        
        while ( left < this.heap.size()) {
            max   = left;
            right = left + 1;
            
            if ( right < this.heap.size()) { // there is a right child
                
                if ( this.heap.get(right).compareTo(this.heap.get(left)) > 0 ) {
                    max++;
                }
            }
            
            if ( this.heap.get(index).compareTo(this.heap.get(max)) < 0) {
                swap = this.heap.get(index);

                this.heap.set(index, this.heap.get(max));
                this.heap.set(max, swap);

                index = max;
                left = ( 2 * index ) + 1;

            } else {
                break;
            }
        }
    }
    
    public T remove() {
        if ( this.heap.size() == 0 ) {
            throw new NoSuchElementException();
        }
        
        if ( this.heap.size() == 1 ) {
            return this.heap.remove(0);
        }
        
        T topNode = this.heap.get(0);
        this.heap.set(0, this.heap.remove(this.heap.size() -1)); // last item moved to top of the list
        moveDown();
        
        return topNode;
    }
    
    public void insert (T item) {
        this.heap.add(item);
        moveUp();
    }
    
    public boolean isEmpty() {
        return this.heap.isEmpty();
    }
    
    @Override
    public String toString() {
        return this.heap.toString();
    }
    
    public T getTop() {
        return this.heap.get(0);
    }
    
    
    
}
