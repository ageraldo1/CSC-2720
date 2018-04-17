/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.trees.binarysearch;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main(String[] args) {
        final int MAX = 20;
        
        Tree<Integer> list = new GenericBinarySearchTree<>();
        HashSet set = new HashSet();
        Random rand = new Random();
        
        for ( int i = 0; i < MAX; i++) {
            set.add(rand.nextInt(100));
        }
        
        Iterator<Integer> it = set.iterator();
        
        while ( it.hasNext()) {
            list.insert(it.next());
        }
        
        
        System.out.println ("**************************************************");
        System.out.println ("List..............: " + set);
        System.out.println ("Size..............: " + list.size());
        System.out.println ("isEmpty...........: " + list.isEmpty());
        System.out.println ("Root..............: " + list.getRoot());
        System.out.println ("Minium value......: " + list.min() );
        System.out.println ("Maximum value.....: " + list.max() );
        
        System.out.print   ("In-Transverse.....: " );
            list.transverse(Tree.transversalOrder.IN);
            System.out.println();
        System.out.print   ("Post-Transverse...: " );
            list.transverse(Tree.transversalOrder.POST);
            System.out.println();
        System.out.print   ("Pre-Transverse....: " );
            list.transverse(Tree.transversalOrder.PRE);
            System.out.println();
            
        System.out.println ("**************************************************");
        
    }
    
}
