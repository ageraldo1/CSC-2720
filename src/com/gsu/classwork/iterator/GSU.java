/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Alexandre
 */

public class GSU implements CollegeIterator{
    
    ArrayList<Student> students;
    
    public GSU() {
        
        this.students = new ArrayList<>();
        
        addStudent(1, "Student 1", 4.0);
        addStudent(2, "Student 2", 3.0);
        addStudent(3, "Student 3", 1.0);
        
    }
    
    private void addStudent(int id, String name, double gpa) {
        Student student = new Student(id, name, gpa);
        this.students.add(student);
    }
    
    // old implementation
    public ArrayList<Student> getStudentList() {
        return this.students;
    }

    @Override
    public Iterator createIterator() {
        return this.students.iterator();
    }
    
    
    
}
