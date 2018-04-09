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
 * @param <E>
 */
public class GenericLinkedList<E extends Comparable<E>> implements Iterable {

    private Node<E> first;
    private int size;

    // Node Inner Class
    class Node<E>  {
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
        this.size = 0;
    }
    
    public E getFirst() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        return this.first.data;
    }
    
    public E getLast() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        Node<E> element = this.first;
        
        while ( element.next != null ) {
            element = element.next;
        }
        
        return element.data;
    }
   
    private Node<E> getNode(E element) {
        
        Node<E> n = this.first;
        
        while ( n.next != null ) {
            
            if ( n.data.equals(element)) {
                return n;
            }
            
            n = n.next;
        }
        
        if ( n.data.equals(element)) {
            return n;
        } else {                
            throw new NoSuchElementException();
        }
    }
    
    public boolean contains(E element) {
        Node<E> n;
        
        try {
            n = getNode(element);
            return true; 
            
        } catch ( NoSuchElementException e) {
            return false;
        }
    }
                
    public void reverseElement(E element) {
        Node<E> currentNode = null;
        Node<E> nextNode = null;
        
        E currentData;
        E nextData;
        
        currentNode = getNode(element);

        if ( currentNode.next == null ) { // tail 
            nextNode = this.first;
            
        } else {        
            nextNode = currentNode.next;        
        }
        
        currentData = currentNode.data;
        nextData = nextNode.data;           

        currentNode.data = nextData;
        nextNode.data = currentData;
    }
    
    public void reverseList() {
        
        Node<E> current;
        Node<E> previous;
        Node<E> next;
        
        current  = this.first; // start at head of the list
        previous = null;      // at first time head will become tail
        next     = null;
        
        while ( current != null ) {
            next = current.next;     // save the next node 
            current.next = previous; // reverse the link

            previous = current;      // used in the next interation
            current = next;          // move to the next node
        }
        
        this.first = previous;        
    }
    
    public void addFirst(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;
        newNode.next = first;
        
        this.first = newNode;
        
        this.size++;
    }
    
    public void addLast(E element) {
        
        Node<E> newNode = new Node<>();
        newNode.data = element;
        newNode.next = null;
        
        Node<E> lastNode = getNode(getLast());
        
        lastNode.next = newNode;
        
        this.size++;
    }
    
    public void add(E element) {
        if ( size() > 0 ) {
            addLast(element);
            
        } else { 
            addFirst(element);
        }
    }
    
    public void addSort(E element) {
        Node<E> newNode = new Node<>();
        newNode.data = element;
        newNode.next = null;
        
        if ( this.first == null ) { 
            addFirst(element);
            
        } else {
            Node<E> current = this.first;
            Node<E> previous = null;
            
            while ( current != null ) {
                
                if ( compareTo(newNode.data, current.data) < 1 ) { // newNode < current
                    break;
                }

                previous = current;
                current = current.next;
            }
            
            if ( current == null ) { // last node
                addLast(element);
            }
            
            if ( this.first == current ) { // changing head
                this.first = newNode;
            }
            
            if ( previous != null ) { // not in the tail of the list
                previous.next = newNode;
            }
            
            newNode.next = current;
            this.size++;
        }
    }
    
    public E removeFirst() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        E element = this.first.data;
        this.first = this.first.next;
        this.size--;
        
        return element;
    }
    
    public E removeLast() {
        
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        Node<E> last = this.first;
        Node<E> previous = null;
        
        while ( last.next != null ) {
            previous = last;
            
            last = last.next;
        }
        
        previous.next = null;
        
        return last.data;
    }
    
    public int size() {
        return this.size;
    }
    
    public Node<E> splitList() {
        if ( this.first == null ) {
            throw new NoSuchElementException();
        }
        
        Node<E> list   = this.first;
        Node<E> runner = list.next;
        Node<E> split  = null;
        
        while (runner != null ) {
            runner = runner.next;
            
            if ( runner == null ) {
                break;
            }
            
            runner = runner.next;
            list   = list.next;
        }
        
        split = list.next;
        list.next = null;
        
        return split;
    }
    
    private <E extends Comparable<E>> int compareTo(E source, E target) {
        if ( source.compareTo(target) > 0 ) {
            return 1;

        } else if ( source.compareTo(target) < 0 ) {
            return -1;
            
        } else { 
            return 0;    
        }
    }        
    
    public void removeAll() {
               
        Node<E> n = this.first;
            
        while ( n != null ) {
            removeFirst();
            
            n = n.next;
        }
    }
    
    @Override
    public Iterator iterator() {
        return new GenericLinkedListIterator();
    }  
    
}


