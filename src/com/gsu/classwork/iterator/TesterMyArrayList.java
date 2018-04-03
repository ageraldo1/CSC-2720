/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class TesterMyArrayList {
    
    public static void main (String[] args) {
        
        List<String> list = new MyArrayList<>();
        list.add("Student 1");
        list.add("Student 2");
        list.add("Student 3");
        
        System.out.println (list);
        
        Iterator it = list.iterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
        for ( String s : list) {
            System.out.println (s);
        }
        
        Iterator it1 = list.iterator();
        Iterator it2 = list.iterator();
        
        it1.next();
        it1.next();
        it1.next();
        
        System.out.println("Iterator1 hasNext()...: " + it1.hasNext());
        System.out.println("Iterator2 hasNext()...: " + it2.hasNext());
        
    }
    
}
