/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

/**
 *
 * @author Alexandre
 */

import java.util.Scanner;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Grades {

    public static void main (String[] args) {
        final String csvFileName = "C:/temp/grades.csv";
        File csvFile = new File (csvFileName);
        
        String[] mapLine;
        int gradesTotal;
        
        HashMap<String, Double> studentGPA = new HashMap<String, Double> ();

        if ( csvFile.exists()) {
            try {
                Scanner sc = new Scanner(csvFile);
                
                while ( sc.hasNext()) {
                    mapLine = sc.nextLine().split(",");
                    gradesTotal = 0;
                    
                    for ( int i = 1; i < mapLine.length; i++) {
                        gradesTotal += Integer.parseInt(mapLine[i]);
                    }
                    
                    studentGPA.put(mapLine[0],(double)(gradesTotal/(mapLine.length-1)) );
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println ("File not found - " + csvFileName);
        }
        
//        System.out.println ("Before sorting");
//        System.out.println (studentGPA);

        List<Entry<String,Double>> sortedList = new LinkedList<>(studentGPA.entrySet());
        
        Collections.sort (sortedList, new Comparator<Entry<String,Double>>() {
            public int compare(Entry<String,Double> o1, Entry<String,Double> o2) {
                
                return o2.getValue().compareTo(o1.getValue());
            }            
        });

        System.out.println (sortedList);
 
    }
}
