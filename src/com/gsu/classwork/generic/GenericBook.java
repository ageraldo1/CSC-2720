/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.generic;

/**
 *
 * @author Alexandre
 */
public class GenericBook<T> {
    
    private int year;
    private T data = null;
    private T[] adata;
    
    public GenericBook() {
        this.year = 1970;
    }
    
    public GenericBook(T initialData) {
        this.year = 1970;
        this.data = initialData;
        this.adata = (T[]) new Object[10];
    }
    
    public GenericBook(int year, T initialData) {
        this.year = year;
        this.data = initialData;
    }
    
    public void setData(T data) {
        this.data = data;
    }
    
    public T getData() {
        return this.data;
    }
    
    public String toString() {
        if ( data != null ) {
            return this.data.toString() + ", " + this.year;
            
        } else { 
            return null + ", " + this.year;
        }
    }
    
    public void process(GenericBook<?> book){
        System.out.println ("getData....:" + book.getData());
        
    }
    
    public void testMethod(GenericBook<? extends Number> u) {
        System.out.println (u.getData());
    }
        
    
}
