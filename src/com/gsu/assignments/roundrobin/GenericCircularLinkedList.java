/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments.roundrobin;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Alexandre
 * @param <E>
 */
public class GenericCircularLinkedList<E> implements Iterable {

    private Node<E> last;
    private int size;

    class Node<E>  {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) { 
            this.element = element;
            this.next = next;
        }
        
        public Node() {
            this.element = null;
            this.next = null;
        }
    }
    
    private class GenericCircularLinkedListIterator implements Iterator<E> {
        
        private Node<E> position;
        private Node<E> previous;
        private boolean isAfterNext;
        
        
        public GenericCircularLinkedListIterator() {
            this.position = null;
            this.previous = null;
            isAfterNext = false;
        }

        @Override
        public boolean hasNext() {
            if ( position == null ) {
                return last != null;
                
            } else { 
                return position != last;
            }
        }

        @Override
        public E next() {
            if ( isEmpty() ) {
                throw new NoSuchElementException();
            }
            
            previous = position;
            isAfterNext = true;
            
            if ( this.position == null ) {
                position = last.next; // first element
                
            } else { 
                position = position.next; // next element
            }
            
            return position.element;
        }


        @Override
        public void remove() {
            if ( !isAfterNext ) { 
                throw new IllegalStateException();
            }
            
            if ( position == last.next ) {
                removeFirst();
                
            } else if ( position == last ) {
                removeLast();
                
            } else {
                previous.next = position.next;
                size--;
            }
            
            position = previous;
            isAfterNext = false;
        }
        
       
    }
    
    public GenericCircularLinkedList() {
        this.last = null;
        this.size = 0;
    }
    
    public void addLast(E element) {
        // the next field of the last node points to the first node of the list
        Node<E> newNode = new Node<>(element, null);
        
        if ( isEmpty() ) {
            this.last = newNode;
            this.last.next = newNode;
            
        } else { 
            newNode.next = this.last.next;  // set the next of the newNode to the first element of the list
            this.last.next = newNode;       // set the next of the last node to the newNode
            this.last = newNode;            // update the last pointer to the newNode
        }
        
        this.size ++;
    }
    
    public void addFirst(E element) {
        Node<E> newNode = new Node<>(element, null);
        
        if ( isEmpty() ) {
            this.last = newNode;
            this.last.next = newNode;
            
        } else { 
            newNode.next = last.next;   // set the next position of newNode to the first element in the list
            last.next = newNode;       // set newNode as the first node in the list
        }
        
        this.size ++;
    }
    
    public void add(E element) {
        if (isEmpty()) {
            addFirst(element);
            
        } else {
            addLast(element);
        }
    }
    
    public int size() {
        return this.size;
    }
    
    public boolean isEmpty() {
        return ( this.size == 0);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[");
        
        if ( !isEmpty() ) {
            Node<E> first = this.last.next;
            
            while ( first != last) {
                sb.append(first.element).append(", ");
                
                first = first.next;
            }
            
            sb.append(first.element);
        }
        
        sb.append("]");
        
        return sb.toString();
    }
    
    public Node<E> removeFirst() {
        if ( isEmpty () ) {
            throw new NoSuchElementException();
        }
        
        Node<E> first = this.last.next;
        
        if ( first == this.last ) {  // list has 1 element
            this.last = null;
            
        } else {
            this.last.next = first.next;
            first.next = null;
        }

        this.size--;
        return first;
    }
    
    public Node<E> removeLast() {
        if ( isEmpty () ) {
            throw new NoSuchElementException();
        }
        
        Node<E> previous = null;
        Node<E> current = this.last.next;
        
        while ( current != this.last) {
            previous = current;
            current = current.next;
        }
        
        if ( current.next == current ) { // one element
            this.last = null;

        } else {          
            previous.next = this.last.next;
            current.next = null;
            
            this.last = previous;
        }
        
        this.size--;
        return current;
    }    
    
    @Override
    public Iterator iterator() {
        return new GenericCircularLinkedListIterator();
    }
    
}
