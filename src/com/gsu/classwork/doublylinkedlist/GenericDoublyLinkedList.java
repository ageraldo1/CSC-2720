/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.doublylinkedlist;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author Alexandre
 */
public class GenericDoublyLinkedList<E>  {
    
    private Node<E> first;
    private Node<E> last;
    private int size;
    
    protected enum Order {
        ASCENDING,
        DESCENDING
    }    
    
    class Node<E>  {
        E element;
        Node<E> previous;
        Node<E> next;
        

        public Node(E element, Node<E> previous, Node<E> next) { 
            this.element = element;
            this.previous = previous;
            this.next = next;
        }
        
        public Node() {
            this.element = null;
            this.previous = null;
            this.next = null;
        }
    }

    public GenericDoublyLinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }
    
    public int size(){
        return this.size;
    }
    
    public boolean isEmpty() {
        return ( this.size == 0);
    }
    
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, null, null);
        
        if ( isEmpty()) {
            this.last = newNode;
            
        } else { 
            this.first.previous = newNode;
        }
        
        newNode.next = this.first;
        this.first = newNode;
        
        this.size++;        
    }
    
    public void addLast (E element) {
        
        Node<E> newNode = new Node<>(element, null, null);
        
        if ( isEmpty()) {
            this.first = newNode;
            
        } else { 
            this.last.next = newNode;
        }
        
        newNode.previous = this.last;
        this.last = newNode;
        
        this.size++;        
    }
    
    public void add(E element) {
        if ( size() == 0 ) {
            addFirst(element);
            
        } else { 
            addLast(element);
        }
    }
    
    public String listToString(Order order) {
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        
        
        if ( !isEmpty() ) {
            if ( order == Order.ASCENDING ) {            
                Node<E> current = this.first;

                while ( current != null) {
                    sb.append(current.element).append(", ");
                    current = current.next;
                }
                sb.setLength(sb.length() -2);                

            } else if ( order == Order.DESCENDING ) {
                Node<E> current = this.last;

                while ( current != null) {
                    sb.append(current.element).append(", ");
                    current = current.previous;
                }
                sb.setLength(sb.length() -2);
            }            
        }
        
        sb.append("]");
        
        return sb.toString();
    }
    
    public Node<E> removeFirst() {
        if ( isEmpty () ) {
            throw new NoSuchElementException();
        }        
        
        Node<E> tempNode = this.first;
        
        if ( this.first == this.last ) {
            this.last = null;
            
        } else { 
            this.first.next.previous = null;
        }
        
        this.first = this.first.next;
        tempNode.next = null;
        this.size--;
        
        return tempNode;        
    }
    
    public Node<E> removeLast() {
        if ( isEmpty () ) {
            throw new NoSuchElementException();
        }        
        
        Node<E> tempNode = this.last;
        
        if ( this.first == this.last ) {
            this.last = null;
            
        } else { 
            this.last.previous.next = null;
        }
        
        this.last = this.last.previous;
        tempNode.previous = null;
        
        this.size--;
        return tempNode;        
    }
    
    

    
}
