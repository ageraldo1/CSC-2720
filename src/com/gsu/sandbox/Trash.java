/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox;

/**
 *
 * @author Alexandre
 */
public class Trash<T> {
    
    private T data;
    
    public Trash(T data) {
        this.data = data;
    }
    
    public T getData() {
        return this.data;
    }
    
    public void setData(T a) {
        this.data = a;
    }
            
    
}
