/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.roundrobin;

/**
 *
 * @author Alexandre
 */
public interface CPU {
    
    public final int QUANTUM = 100; //ms
    
    public void schedule(Process p);

    public int size();

    public boolean isEmpty();

    public String printScheduleQueue();

    public void processQueue(boolean printStats);
    
    public int maxQueueWaitTime();
    
    public double averageWaitTime();
    
    public void printQueueStatistics();
    
    
}
