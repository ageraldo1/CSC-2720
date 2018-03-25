/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;


/**
 *
 * @author Alexandre
 */
public class SampleIterator {
    
    public static void main (String args[]) {
        
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        
        
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        Iterator<Integer> iterator = list.iterator();
        
        while ( iterator.hasNext() ) {
            System.out.println (iterator.next());
        }
        
        // foreach        
        for ( int i : list) {
            System.out.println (i);
        }
        
        
    }
    
}

