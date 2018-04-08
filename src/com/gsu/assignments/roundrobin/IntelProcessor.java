/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.roundrobin;

import java.util.Iterator;

/**
 *
 * @author Alexandre
 */
public class IntelProcessor implements CPU {

    private GenericCircularLinkedList<Process> queue;
    
    public IntelProcessor() {
        this.queue = new GenericCircularLinkedList<>();
    }
    
    @Override
    public void schedule(Process p) {
        queue.add(p);
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public String printScheduleQueue() {
        return queue.toString();
    }

    @Override
    public void processQueue(boolean printStats) {
        Iterator it;
        Process p;
        
        do {
            it = queue.iterator();
            
            while ( it.hasNext()) {
                p = (Process)it.next();
                p.run(QUANTUM);
                
                if ( p.getProcessState() == Process.State.FINISH) {
                    it.remove();
                }             
            }
            
            if ( queue.size() == 0) {
                break;
            }
            
            if ( printStats) {
                printQueueStatistics();
            }
            
        } while ( 1 == 1 );
    }

    @Override
    public int maxQueueWaitTime() {
        Iterator it;
        int max=0;
        Process p;
        
        it = queue.iterator();
        
        while ( it.hasNext()) {
            p = (Process)it.next();
            
            max = max + p.getBurstTime();
        }
        
        return max;
    }

    @Override
    public double averageWaitTime() {
        return ((double)maxQueueWaitTime()/queue.size());
    }

    @Override
    public void printQueueStatistics() {
        System.out.println ("Current queue elements..............: " + printScheduleQueue());
        System.out.println ("Max wait time(ms)...................: " + maxQueueWaitTime());
        System.out.println ("Average wait time(ms)...............: " + averageWaitTime());
        System.out.println ("Queue size..........................: " + size());
        System.out.println ("\n");
        
    }
    
    

    
}
