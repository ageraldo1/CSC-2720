/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.queues;

/**
 *
 * @author Alexandre
 */

import java.util.Random;

public class Tester {
    
    private static final String header = "*****************************************";
    private static final int MAX_ITEMS = 3;
    private static final int RANDOM_RANGE=51;
    
    public static void main (String[] args)  throws CircularException {
       
        System.out.println (header);
        System.out.println ("Circular Queue Test Class");
        System.out.println (header);
        
        CircularQueue queue = new CircularQueue();
        
        System.out.println ("IsEmpty method.....:" + queue.isEmpty());
        System.out.println ("IsFull method......:" + queue.isFull());
        System.out.println ("Initial Queue......:" + queue.toString());
        
        Random rand = new Random();
        
        for ( int i = 0; i < MAX_ITEMS; i++ ) {
            queue.add(rand.nextInt(RANDOM_RANGE));
        }
        System.out.println ("Queue..............:" + queue.toString());
        System.out.println ("Statistics.........:");
        queue.showStats();
        
        System.out.println ("IsFull method......:" + queue.isFull());
        
        System.out.println (header);
        queue.add(rand.nextInt(RANDOM_RANGE));
        queue.add(rand.nextInt(RANDOM_RANGE));
        queue.add(rand.nextInt(RANDOM_RANGE));
        System.out.println ("Queue..............:" + queue.toString());
        queue.showStats();
        
        
        queue.remove();
        System.out.println ("Queue..............:" + queue.toString());
        queue.showStats();
        
        queue.remove();
        System.out.println ("Queue..............:" + queue.toString());
        queue.showStats();
        
        queue.add(rand.nextInt(RANDOM_RANGE));
        System.out.println ("Queue..............:" + queue.toString());
        queue.showStats();

        
        System.out.println ("Peek...............:" + queue.peek());
        
        queue.add(rand.nextInt(RANDOM_RANGE));
        
        System.out.println ("IsFull method......:" + queue.isFull());
        System.out.println ("Queue..............:" + queue.toString());
        queue.showStats();
        
        System.out.println ("Format Queue......:" + queue.printFormatQueue());
        
        
        System.out.println (header);
        System.out.println ("Process completed without errors");
        System.out.println (header);
        
        
        
        
        
        
        
    }
    
}
