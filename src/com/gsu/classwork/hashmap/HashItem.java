/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.hashmap;

/**
 *
 * @author Alexandre
 */
public class HashItem {
    private int key;
    private int value;
    private HashItem next;
    
    public HashItem(int k, int v) {
        this.key = k;
        this.value  = v;
        this.next = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public HashItem getNext() {
        return next;
    }

    public void setNext(HashItem next) {
        this.next = next;
    }
    
    
            
    
}
