/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.hashmap;

import java.util.NoSuchElementException;

/**
 *
 * @author Alexandre
 */
public class HashTable {
    
    private final int TABLE_SIZE=10;
    
    private HashItem[] hashTable;
    private int size;
    private int collisions;
    
    public HashTable(){
        this.hashTable = new HashItem[TABLE_SIZE];
        this.size = 0;
        this.collisions = 0;
    }
    
    private int hash(int key) {
        return key % this.TABLE_SIZE;
    }
    
    public void put(int key, int value) {
        
        int index = hash(key);
        
        if ( hashTable[index] == null ) {
            hashTable[index] = new HashItem(key, value);
            
        } else { // collision
            this.collisions++;
            
            HashItem node = hashTable[index];

            while ( node.getNext() != null) {
                node = node.getNext();
            }
            
            node.setNext(new HashItem(key, value));            
        }        
        
        this.size++;
    }
    
    public int get(int key) {
        int index = hash(key);
        
        if ( this.hashTable[index] == null ) {
            throw new NoSuchElementException("Key " + key + " not found");
            
        } else {
            HashItem node = this.hashTable[index];
            
            while ( node.getNext() != null && node.getKey() != key ) {
                node = node.getNext();
            }
            
            if ( node == null) {
                throw new NoSuchElementException("Key " + key + " not found");
            }
            
            return node.getValue();
        }
        
    }
    
    public int getCollissions() {
        return this.collisions;
    }
    
    public int size() {
        return this.size;
    }
    
}
