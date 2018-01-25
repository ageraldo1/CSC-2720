/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class StudentList {
    private static final String CSV_FILE = "C:/temp/grades.csv";    
    
    private ArrayList<Student> studentList = new ArrayList<>();
    
    public void load() {
        Scanner sc = null;
        String[] mapLine;
        
        File studentFile = new File (CSV_FILE);
        
        try {
            sc = new Scanner(studentFile);

            while ( sc.hasNext()) {
                mapLine = sc.nextLine().split(",");
                int[] grades = new int[(mapLine.length -1)];
                
                for ( int i = 0; i < grades.length; i++) {
                    grades[i] = Integer.parseInt(mapLine[i+1]);
                }
                
                studentList.add (new Student(mapLine[0], grades));
            }
            
        } catch (FileNotFoundException e) {
            System.out.println ("Grades file " + CSV_FILE + " not found.");

        } finally {
            try {
                sc.close();
            } catch (NullPointerException ex) {}
        }
        
        Collections.sort(studentList);
        
    }
    
    public int size() {
        return studentList.size();
    }
    
    public Student getHighestAverage() {

        Student student = null;
        double highestAverage = 0.0;
        
        for ( int i = 0; i < studentList.size(); i++) {
            if ( studentList.get(i).getAverage() > highestAverage ) {
                student = studentList.get(i);
                highestAverage = student.getAverage();
            }
        }
        
        return student;
    }
    
    public Student getLowestAverage() {

        Student student = null;
        double lowestAverage = 100.0;
        
        for ( int i = 0; i < studentList.size(); i++) {
            if ( studentList.get(i).getAverage() < lowestAverage ) {
                student = studentList.get(i);
                lowestAverage = student.getAverage();
            }
        }
        
        return student;
    }    
    
    public ArrayList<Student> getTop3Averages() {
        ArrayList<Student> topThree = new ArrayList<>();
        
        for ( int i  = 0; i < 3; i++) {
            if ( i > studentList.size() ) {
                break;
            }
            
            topThree.add (studentList.get(i));
        }
        
        return topThree;
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
}
