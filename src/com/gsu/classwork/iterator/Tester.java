/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String[] args) {
        
        GSU gsu = new GSU();
        GeorgiaTech gt = new GeorgiaTech();
        DeVry dv = new DeVry();
        
        // Without iterator
        System.out.println ("\nWithout Iterator implementation");
        ArrayList<Student> list1 = gsu.getStudentList();        
        Student[] list2 = gt.getStudentList();
        Hashtable<Integer,Student> list3 = dv.getStudentList();
        
        System.out.println ("GSU Students.............: " + list1 );
        System.out.println ("Georgia Tech Students....: " + Arrays.toString(list2) );
        System.out.println ("DeVry Students...........: " + list3 );
        
        System.out.println ("\n\n");
        // Using iterator        
        System.out.println ("Using Iterator implementation");
        Iterator it;
        CollegeIterator list4 = new GSU();
        CollegeIterator list5 = new GeorgiaTech();
        CollegeIterator list6 = new DeVry();
        
        System.out.println ("GSU students...");
        it = list4.createIterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
        System.out.println ("Georgia Tech students...");
        it = list5.createIterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
        
        System.out.println ("DeVry students...");
        it = list6.createIterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
    
        
        
        
        
        
        
        
        
    }
    
}
