/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Alexandre
 */
public class GenericLinkedList<E> implements Iterable {

    private Node<E> first;

    // Node Inner Class
    class Node<E> {
        E data;
        Node<E> next;
    }
    
    // GenericLinkedListIterator inner class
    
    class GenericLinkedListIterator implements Iterator<E> {
        private Node<E> position;
        private Node<E> previous;
        private boolean isAfterNext;

        public GenericLinkedListIterator() {
            this.position = null;
            this.previous = null;
            this.isAfterNext = false;
        }

        @Override
        public boolean hasNext() {
            if ( this.position == null ) {
                return first != null;
                
            } else {
                return this.position.next != null;
            }
        }

        @Override
        public E next() {
            if ( !hasNext() )  {
                throw new NoSuchElementException();
            }
            
            previous = position; // remember for remove
            isAfterNext = true;
            
            if ( this.position == null ) {
                this.position = first;
                
            } else {
                this.position = position.next;
            }

            return position.data;
        }


        @Override
        public void remove() {
            if ( !isAfterNext ) { 
                throw new IllegalStateException();
            }
            
            if ( position == first ) {
                removeFirst();
            } else {
                previous.next = position.next;
            }
            
            position = previous;
            isAfterNext = false;
        }
        
    }
    
    public GenericLinkedList() {
        this.first = null;
    }
    
    public E getFirst() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        return this.first.data;
    }
    
    private Node<E> getLast() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        Node<E> element = this.first;
        
        while ( element.next != null ) {
            element = element.next;
        }
        
        return element;
    }
    
    private Node<E> getPrevious(Node<E> element) {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }

        Node<E> previous = this.first;
        
        while ( previous.next != null ) {
            
            if ( previous.next == element ) {
                break;
            }
            
            previous = previous.next;
        }
        
        return previous;
    }
    
    private Node<E> getNext(Node<E> element) {
        return null;
    }
    
    
    public void addFirst(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;
        newNode.next = first;
        
        this.first = newNode;
    }
    
    public void addLast(E element) {
        Node<E> lastNode = getLast();
        Node<E> newNode = new Node<>();

        newNode.data = element;
        lastNode.next = newNode;
    }
    
    public void add(E element) {
        if ( this.first == null ) {
            addFirst(element);
            
        } else {
            addLast(element);
        }
    }
    
    
    public E removeFirst() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        E element = this.first.data;
        this.first = this.first.next;
        
        return element;
    }
    
    public E removeLast() {
        // 
        return null;
    }
    
    
    @Override
    public Iterator iterator() {
        return new GenericLinkedListIterator();
    }
    
    public static void main (String args[]) {
        GenericLinkedList<String> list = new GenericLinkedList<>();
        Iterator it;
        
        list.add("Student 1");
        list.add("Student 2");
        list.add("Student 3");
        list.add("Student 4");
        list.add("Student 5");
        
            
        
        it = list.iterator();
        
        while ( it.hasNext()) {
            System.out.println (it.next());
        }
        
        
        
        //System.out.println (list.getLast().data);
        
    }
    
}



