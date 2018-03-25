/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.queues;

import java.util.PriorityQueue;

/**
 *
 * @author Alexandre
 */
public class PriorityQueueJFC {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> squeue = new PriorityQueue<>();
        PriorityQueue<Integer> nqueue = new PriorityQueue<>();
        
        squeue.add("Z");
        squeue.add("A");
        squeue.add("B");
        squeue.add("C");
        
        System.out.println ("String PriorityQueue");
        System.out.println ("First Element....: " + squeue.peek());
        System.out.println ("Queue............: " + squeue.toString());
        
        nqueue.add(100);
        nqueue.add(10);
        nqueue.add(1);
        
        System.out.println ("Integer PriorityQueue");
        System.out.println ("First Element....: " + nqueue.peek());
        System.out.println ("Queue............: " + nqueue.toString());
        
        while (nqueue.isEmpty() == false) {
            System.out.println (nqueue.poll());
        }
        
        
    }
    
}

