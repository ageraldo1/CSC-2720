/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author ageraldo1
 */
public class Student implements Comparable<Student> {
    
    private String name;
    private int[] scores;
    private double gradeAverage;
    
    public Student(String studentName, int[] studentScores) {
        this.name = studentName;
        this.scores = studentScores;
        
        setAverage();
    }
    
    public String getName() {
        return this.name;
    }
    
    private void setAverage() {
        double gradesTotal = 0.0;
        
        for ( int i = 0; i < scores.length; i++) {
             gradesTotal += scores[i];
        }
        
        this.gradeAverage = (gradesTotal / (scores.length));
    }

    public double getAverage() {
        
        return this.gradeAverage;
    }
    
    public int[] getGrades() {
        return scores;
    }

    public int compareTo(Student t) {
        if ( t.getAverage() < this.getAverage()  ) {
            return -1;
        } else if  ( t.getAverage() == this.getAverage() ) {
            return 0;
            
        } else {
            return 1;
        }
    }    
    
    @Override
    public String toString() {
        return "Student : " + this.name + ", Scores : " + Arrays.toString(scores) + ", Grade average : " + this.gradeAverage;
    }
}
