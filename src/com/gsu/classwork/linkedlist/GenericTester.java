/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.linkedlist;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alexandre
 */
public class GenericTester {
    
    public static void main (String args[]) {
        GenericLinkedList<Integer> list = new GenericLinkedList<>();   
        
        Random rand = new Random();
        Iterator it;
        int retValue;
 
        for ( int i = 0; i < 10; i++) {
            list.add(rand.nextInt(50));            
        }
        
        System.out.println ("LinkedList.................: " + printLinkedList(list));
        System.out.println ("Head of the list...........: " + list.getFirst());
        System.out.println ("Tail of the list...........: " + list.getLast());
        
        Scanner input = new Scanner(System.in);
        
        do {            
            try {
                System.out.print ("Element number to remove...: ");
                retValue = input.nextInt();
            
                if ( !list.contains(retValue)) {
                    System.out.println ("Invalid not found!!!");
                
                } else { 
                    break;
                }                        
            } catch (InputMismatchException e) {
                input.next(); // clear the entire
                System.out.println ("Invalid element!!!");
            }
            
        } while ( true == true);
        
        
        it = list.iterator();
        
        while ( it.hasNext()) {
            if ( it.next().equals(retValue)) {
                it.remove();
                break;
            }            
        }
        
        System.out.println ("Linked list after remove...: " + printLinkedList(list));
        list.reverseList();
        System.out.println ("Reversed list..............: " + printLinkedList(list));
        
        
        
        GenericLinkedList.Node nodeList = list.splitList();
        

        System.out.println ("Split list[1]..............: " + printLinkedList(list));
        System.out.println ("Split list[2]..............: " + printNodeList(nodeList));

    }    

    private static String printLinkedList(GenericLinkedList list) {
        StringBuilder sb = new StringBuilder();
        Iterator it;

         
        sb.append("[");
        it = list.iterator();
        
        while ( it.hasNext()) {
            sb.append(it.next()).append(", ");
        }
        
        if ( sb.length() > 1) { 
            sb.setLength(sb.length() -2);
        }
        
        sb.append("]");
        
        return sb.toString();
    }
    
    private static String printNodeList(GenericLinkedList.Node nodeList) {
        StringBuilder sb = new StringBuilder();
        GenericLinkedList.Node node = nodeList;
        
        sb.append("[");

        while ( node != null ) {
            sb.append(node.data).append(", ");
            node = node.next;
        }
        
        if ( sb.length() > 1) { 
            sb.setLength(sb.length() -2);
        }
        
        sb.append("]");
        
        return sb.toString();
    }    
 
    
}
