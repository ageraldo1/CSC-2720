/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.linkedlist;

import java.util.Iterator;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        
        LinkedList students = new LinkedList();
        
        students.addAtEnd(1, "Student1");
        students.addAtEnd(2, "Student2");
        students.addAtEnd(3, "Student3");
        
        System.out.println("********************************************");
        System.out.println("List Size.........: " + students.size());
        System.out.println("Head..............: " + students.getFirstNode());
        System.out.println("Tail..............: " + students.getLastNode());
        System.out.println("StudentList.......: " + students.printList());
        
        students.addAtStart(4, "Student4");
        System.out.println("StudentList.......: " + students.printList());
        //System.out.println("GetNode...........: " + students.getNode(3));
        
        students.addAtPosition(2, 5, "Student5");
        System.out.println("StudentList.......: " + students.printList());
        
        students.deleteAtPosition(0);
        System.out.println("StudentList.......: " + students.printList());

        students.deleteAtPosition(2);
        System.out.println("StudentList.......: " + students.printList());

        students.deleteAtPosition(1);
        System.out.println("StudentList.......: " + students.printList());
        System.out.println("List Size.........: " + students.size());
        System.out.println("********************************************");
        
        
        // Iterator
        students.addAtEnd(5, "Student5");
        students.addAtEnd(6, "Student6");
        students.addAtEnd(7, "Student7");
        
        Iterator it = students.iterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
        
        
    }
    
}
