/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Alexandre
 */
public class DeVry implements CollegeIterator {
    
    Hashtable<Integer, Student> students;
    private int key = 0;
    
    public DeVry () {
        this.students = new Hashtable<>();
        
        addStudent(7, "Student 7", 3.2);
        addStudent(8, "Student 8", 2.3);
        addStudent(9, "Student 9", 1.7);        
        
    }
    
    private void addStudent(int id, String name, double gpa) {
        Student student = new Student(id, name, gpa);
        
        this.students.put(key, student);
        key ++;
    }
    
    // old code
    public Hashtable<Integer,Student> getStudentList() {
        return this.students;
    }    

    @Override
    public Iterator createIterator() {
        return this.students.values().iterator();
    }
    
    
}
