/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox.list;

import java.util.NoSuchElementException;

/**
 *
 * @author Alexandre
 */
public class LinkedList<T extends Comparable<T>> {
    
    class Node<T extends Comparable<T>> {
        private T element;
        private Node next;
        
        public Node(T element) {
            this.element = element;
            this.next = null;
        }
        
        @Override
        public String toString() {
            return this.element.toString();
        }
    }
    
    private Node head;
    private int size;
    
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    public void insert(T element) {
        Node node = new Node<>(element);
        
        if ( this.head == null  ) {
            this.head = node;
            
        } else {
            node.next = head;
            head = node;
        }
        
        this.size ++;
        
    }
    
    public int size() {
        return this.size;
    }
    
    public void remove (T element) {
        boolean found = false;
        
        if ( this.head == null ) {
            throw new NoSuchElementException();
        }
        
        if ( this.head.element.compareTo(element) == 0 )  {
            this.head = null;
            found = true;
            
        } else {
            Node node = this.head;
            Node previous = null;            
            
            while ( node.next != null) {
                
                if ( node.element.compareTo(element) == 0 ) {
                    previous.next = node.next;
                    node.next = null;
                    found = true;
                    
                    break;
                }
                
                previous = node;
                node = node.next;
            }            
        }
        
        if ( found == true ) { 
            this.size--;
            
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public void transverse() {
        StringBuilder result = new StringBuilder();
        
        if ( this.head != null ) {
            
            Node node = this.head;
            
            while ( node != null) {
                result.append(node.element).append(" -> ");
                
                node = node.next;
            }
            
            result.setLength(result.length() - 4);
            System.out.println (result);
        }
    }

    
    
    
}
