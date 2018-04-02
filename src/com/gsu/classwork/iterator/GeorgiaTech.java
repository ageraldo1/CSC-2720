/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author Alexandre
 */
public class GeorgiaTech implements CollegeIterator {
    
    Student[] students;
    private int position = 0;
    
    public GeorgiaTech() {
        this.students = new Student[3];
        
        addStudent(4, "Student 4", 4.0);
        addStudent(5, "Student 5", 3.0);
        addStudent(6, "Student 6", 1.0);
    }
    
    private void addStudent(int id, String name, double gpa) {
        Student student = new Student(id, name, gpa);
        
        this.students[position] = student;
        position ++;
    }
    
    // old implementation
    public Student[] getStudentList() {
        return this.students;
    }    

    @Override
    public Iterator createIterator() {
        return Arrays.asList(students).iterator();
    }
            
    
}
