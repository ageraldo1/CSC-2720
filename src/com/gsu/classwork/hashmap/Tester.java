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
public class Tester {
    
    public static void main (String[] args) {
        HashTable table = new HashTable();
        
        table.put(1, 10);
        table.put(2, 20);
        table.put(3, 30);
        table.put(3, 40);
        table.put(3, 50);
        
        System.out.println ("HasTable size......: " + table.size());
        System.out.println ("Collissions........: " + table.getCollissions());
        System.out.println ("Get first value....: " + table.get(1));
        System.out.println ("Get second value...: " + table.get(3));
        
    }
    
}
