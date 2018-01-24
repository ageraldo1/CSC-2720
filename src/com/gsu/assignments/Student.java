/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork;

import java.util.ArrayList;

/**
 *
 * @author ageraldo1
 */
public class Student implements Comparable<Student> {
    
    private String name;
    private ArrayList<Integer> scores;
    
    public String getName() {
        return this.name;
    }
    
    public double getAverage() {
        double gradesTotal = 0.0;
        

        for ( int i = 0; i < scores.size(); i++) {
             gradesTotal += scores.get(i);
        }
        
        return (gradesTotal / (scores.size() -1));
    }
    
    public String getGrades() {
        return scores.toString();
    }

    public int compareTo(Student t) {
        if ( this.getAverage() < t.getAverage()  ) {
            return -1;
        } else if  ( this.getAverage() == t.getAverage() ) {
            return 0;
            
        } else {
            return 1;
        }
    }
    
}
