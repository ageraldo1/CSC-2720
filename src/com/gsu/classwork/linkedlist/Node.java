/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.linkedlist;

/**
 *
 * @author Alexandre
 */
public class Node {
    
    private String name;
    private int id;
    private Node next;
    
    public Node(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
    }
    
    @Override
    public String toString() {
        return "[" + this.id + "]=" + this.name;
    }
    
    public void setNext(Node node) { 
        this.next = node;
    }
    
    public Node getNext() {
        return this.next;
    }
    
    
}
