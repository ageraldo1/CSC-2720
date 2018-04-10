/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.doublylinkedlist;

/**
 *
 * @author Alexandre
 */
import java.util.Random;

public class Tester {
    
    public static void main (String args[]) {
        final int totalElements = 20;
        
        Random rand = new Random();
        
        GenericDoublyLinkedList<Integer> list = new GenericDoublyLinkedList<>();
        
        for ( int i = 0; i < totalElements; i++) {
            list.add(i+1);
        }
        
        System.out.println ("List size.........: " + list.size());
        System.out.println ("IsEmpty...........: " + list.isEmpty());
        System.out.println ("Ascending List....: " + list.listToString(GenericDoublyLinkedList.Order.ASCENDING));
        System.out.println ("Descending List...: " + list.listToString(GenericDoublyLinkedList.Order.DESCENDING));
       
        int nr_remove = rand.nextInt(totalElements);
        
        System.out.println ("\nRemoving the first " + nr_remove + " elements......");
        
        for ( int i = 0; i < nr_remove; i++) {
            list.removeFirst();
        }
        
        System.out.println ("Ascending List....: " + list.listToString(GenericDoublyLinkedList.Order.ASCENDING));
        System.out.println ("Descending List...: " + list.listToString(GenericDoublyLinkedList.Order.DESCENDING));
        System.out.println ("List size.........: " + list.size());
        
        
    }
    
}
