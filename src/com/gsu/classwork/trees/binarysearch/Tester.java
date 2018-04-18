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
        final int MAX = 30;
        int value;
        
        Tree<Integer> list = new GenericBinarySearchTree<>();
        HashSet set = new HashSet();
        Random rand = new Random();
        
//        list.insert(100);
//        list.insert(50);
//        list.insert(200);
//        list.insert(30);
//        list.insert(60);
//        list.insert(150);
//        list.insert(300);
//        list.insert(29);
//        list.insert(28);
//        list.insert(301);
//        list.insert(302);


//
//         list.insert (10);
//         list.insert (5);
//         list.insert (15);
//         list.insert (3);
//         list.insert (7);
         
        
//        list.insert(50);
//        list.insert(40);
//        list.insert(70);
//        list.insert(60);
//        list.insert(80);

//        list.insert(5);
//        list.insert(2);
//        list.insert(12);
//        list.insert(-4);
//        list.insert(3);
//        list.insert(9);
//        list.insert(21);
//        list.insert(19);
//        list.insert(25);


        

        list.insert(40);
        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.insert(60);
        list.insert(50);
        list.insert(70);
        list.insert(5);
        list.insert(13);
        list.insert(55);
        list.transverse(Tree.transversalOrder.IN);
        System.out.println ();
        System.out.println (list.getRoot());
        
        //---> error  : list.remove(2);
        list.remove(20);
        System.out.println (list.getRoot());
        list.transverse(Tree.transversalOrder.IN);
        System.out.println ();
        
        
//        for ( int i = 0; i < MAX; i++) {
//            value = rand.nextInt(100);
//            
//            if ( !list.contains(value)) {
//                list.insert(value);
//                set.add(value);
//            }
//        }       
//        
//        
//        System.out.println ("**************************************************");
//        System.out.println ("List..............: " + set);
//        System.out.println ("Expected size.....: " + MAX);
//        System.out.println ("Size..............: " + list.size());
//        System.out.println ("isEmpty...........: " + list.isEmpty());
//        System.out.println ("Root..............: " + list.getRoot());
//        System.out.println ("Minium value......: " + list.min() );
//        System.out.println ("Maximum value.....: " + list.max() );
//            
//        System.out.print   ("Pre-Transverse....: " );
//            list.transverse(Tree.transversalOrder.PRE);
//            System.out.println();
//            
//        System.out.print   ("In-Transverse.....: " );
//            list.transverse(Tree.transversalOrder.IN);
//            System.out.println();
//            
//        System.out.print   ("Post-Transverse...: " );
//            list.transverse(Tree.transversalOrder.POST);
//            System.out.println();
//            
//            
//            
//        System.out.println ("**************************************************");
        
    }
    
}




