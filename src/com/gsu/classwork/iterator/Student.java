/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

/**
 *
 * @author Alexandre
 */
public class Student {
    
    private int id;
    private String name;
    private double gpa;
    
    public Student(int id, String name, Double gpa ) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    
    public int getID() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public double getGPA() {
        return this.gpa;
    }
    
    @Override
    public String toString() {
        return "[" + this.id + "]=" + this.name + "->" + this.gpa;
    }
    
    
    
}
