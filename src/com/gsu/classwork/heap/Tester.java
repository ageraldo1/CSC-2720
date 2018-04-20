/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.heap;

import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        queue.add(1);
        queue.add(3);
        queue.add(5);
        queue.add(100);
        queue.add(500);
        
        System.out.println ("Queue size......: " + queue.size());
        System.out.println ("IsEmpty.........: " + queue.isEmpty());
        System.out.println ("Peek............: " + queue.peek());
        System.out.println ("Queue...........: " + queue.toString());
        System.out.println ("Remove top......: " + queue.remove());
        System.out.println ("Queue...........: " + queue.toString());
        
        queue.add(10000);
        System.out.println ("Peek............: " + queue.peek());
        
        
    }
    
        
        
    
    
}
