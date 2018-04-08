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
public class Process {
    
    private int id;
    private int burstTime;
    private State processStatus;
    
    private final int ID_RANGE=1000;
    Random rand = new Random();
    
    protected enum State {
        IDLE,
        RUNNING,
        FINISH
    }
    
    public Process(int id, int ms) {
        this.id = id;
        this.burstTime = ms;
        this.processStatus = State.IDLE;
    }
    
    public Process(int ms) {
        this.id = rand.nextInt(ID_RANGE);
        this.burstTime = ms;
        this.processStatus = State.IDLE;
    }
    
    public int getBurstTime() {
        return this.burstTime;
    }
    
    private void setBurstTime(int ms) {
        this.burstTime = ms;
    }
    
    public State getProcessState() {
        return this.processStatus;
    }
    
    public void run(int ms) {
        this.processStatus = State.RUNNING;
        
        try {
            Thread.sleep(ms);
            
        } catch ( InterruptedException e ) {
            
        } finally {
            if ( ms < this.burstTime) {
                setBurstTime(this.burstTime - ms);
                
            } else { 
                this.processStatus = State.FINISH;
            }
        }
    }
    
    public String toString() {
        return "[ID]="  + this.id + ",[BurstTime]=" + this.burstTime + ",[Status]=" + this.processStatus;
    }
    
}
