/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.arrays;

import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class CustomArrayList {
    
    private int MAX_ARRAY_SIZE = 5;    
    private Object[] arrayList = new Object[MAX_ARRAY_SIZE];
    private int arraySize;
    
    public CustomArrayList() {
        this.arraySize = 0;        
    } 
    
    public int size() {
        return arraySize;        
    }
    
    public boolean isFull() {
        return (this.size() == arrayList.length);
    }
    
    public boolean isEmpty() {
        return (this.size() == 0);
    }
    
    public void add(Object element) {
        if ( this.isFull() == false) {
            arrayList[this.arraySize] = element;
            this.arraySize ++;
            
            
        } else { 
            throw new IndexOutOfBoundsException();
        }        
    }
    
    @Override
    public String toString() {
        return Arrays.toString(arrayList);        
    }
    
    public void remove(int index) {
        checkRange(index);
        
        for ( int i = index; i < this.arrayList.length -1; i++) {
            this.arrayList[i] = this.arrayList[i + 1];
        }
        
        this.arraySize--;
        this.arrayList[arraySize] = null;
    }
    
    private void checkRange(int index) {
        if (index < 0 || index >= this.size()) {            
            throw new IndexOutOfBoundsException();
        }
    }
    
    public Object get(int index) {
        checkRange(index);
        
        return this.arrayList[index];
    }
    
    public void set(int index, Object element) {
        checkRange(index);
        
        this.arrayList[index] = element;        
    }
    
    
    
    
    
}
