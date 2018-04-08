/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.roundrobin;

import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Computer {
    
    public static void main (String args[]) {
        final int MAX_PROCESS = 20;
        
        CPU component = new IntelProcessor();
        Random rand = new Random();
        
        for ( int i = 0; i < MAX_PROCESS; i++) {
            component.schedule(new Process(rand.nextInt(1000) + CPU.QUANTUM));
        }
        
        System.out.println ("Initial processor queue state");
        component.printQueueStatistics();
        
        System.out.println ("Running process queue.............");
        component.processQueue(true);
        
        System.out.println ("Final processor queue state");
        component.printQueueStatistics();
        
    }
    
}
