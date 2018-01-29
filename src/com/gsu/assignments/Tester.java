package com.gsu.assignments;

import java.util.Collections;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String[] args) {
        StudentList st = new StudentList();

        st.load();
        
        System.out.println ("Total of students......: " + st.size());
        System.out.println ("Highest Average........: " + st.getHighestAverage());
        System.out.println ("Lowest Average.........: " + st.getLowestAverage());
        System.out.println ("Top 3 averages.........: "  + st.getTop3Averages());
        System.out.println ("Full List..............: "  + st.getStudentList());
    }
    
}
