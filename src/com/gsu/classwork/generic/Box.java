/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.generic;

/**
 *
 * @author Alexandre
 * @param <T>
 */
public class Box<T> {
    private T box;
    
    public T get() {
        return this.box;
    }
    
    public void set(T box) {
        this.box = box;
    }
    
}
