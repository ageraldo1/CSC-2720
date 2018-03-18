/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Alexandre
 */
public class LinkedList {
    private Node head;
    private int size;
    
    LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public boolean isEmpty() { 
        return ( this.head == null);
    }
    
    public int size() { 
        return this.size;
    }
    
    public void addAtEnd (int studentId, String studentName) {
        Node node = new Node(studentId, studentName);
        
        if ( isEmpty()) {
            this.head = node;
            
        } else { 
            Node n = getLastNode();
            n.setNext(node);
        }
        
        this.size++;
    }
    
    public void addAtStart(int studentId, String studentName) {
        Node node = new Node(studentId, studentName);
        node.setNext(getFirstNode());
        
        this.head = node;        
        this.size++;
    }
    
    public void addAtPosition(int position, int studentId, String studentName) {
        
        if ( position == 0 ) {
            addAtStart(studentId, studentName);
            
        } else if ( position == this.size() -1 ) {
            addAtEnd(studentId, studentName);
            
        } else { 
            Node node = new Node(studentId, studentName);
            Node previousNode = getNode(position -1);
        
            node.setNext(previousNode.getNext());
            previousNode.setNext(node);            
        }
        
    }
    
    public void deleteAtPosition (int position) {

        Node currentNode = getNode(position);
        
        if ( position == 0 ) {
            this.head = this.head.getNext();
            
        } else if ( position == this.size() -1) {
            Node previousNode = getNode(position -1);
            previousNode.setNext(null);
            
        } else {
            Node previousNode = getNode(position -1);
            
            
            previousNode.setNext(currentNode.getNext());
        }
        
        this.size--;
        currentNode = null;
    }
         
    public Node getFirstNode() {
        return this.head;
    }
    
    public Node getLastNode() {
        Node n = getFirstNode();
        
        while ( n.getNext() != null ) {
            n = n.getNext();
        }
        
        return n;
    }
    
    public Node getNode(int position) {
        
        if ( position < 0 || position >= this.size()) {
            throw new IndexOutOfBoundsException();            
            
        } else if ( position == 0 ) {
            return getFirstNode();
            
        } else if ( position == this.size() -1 ) {
            return getLastNode();
        
        } else {         
            Node n = getFirstNode();
            int pos = 0;
            Node retNode = null;

            while ( n.getNext() != null ) {
                if ( position == pos) {
                    retNode = n;
                    break;
                }

                n = n.getNext();

                pos ++;
            }                
        
            return retNode;
        }
    }
    
    public String printList() {
        
        StringBuilder sb = new StringBuilder();
        
        Node n = getFirstNode();
                
        while ( n.getNext() != null ) {
            sb.append(n).append(", ");            
            
            n = n.getNext();
        }
        
        sb.append(n);        
        return sb.toString();
    }
     
    
}
