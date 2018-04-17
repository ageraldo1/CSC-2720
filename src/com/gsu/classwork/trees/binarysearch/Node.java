/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.trees.binarysearch;

/**
 *
 * @author Alexandre
 * @param <T>
 */
public class Node<T> {
    
    private T element;
    private Node<T> left;
    private Node<T> right;
    
    public Node() {
        this.element = null;
        this.left = null;
        this.right = null;
    }
    
    public Node(T element) {
        this.element = element;
        this.left = null;
        this.right = null;
    }
    
    public Node(T element, Node<T> left, Node<T> right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public String toString() {
        return this.element.toString();
    } 
    
    public T getNodeElement() { 
        return this.element;
    }
    
    public void setNodeElement(T element) { 
        this.element = element;
    }
    
    public Node<T> getLeftNode() {
        return this.left;
    }
    
    public void setLeftNode(Node<T> left) {
        this.left = left;
    }
    
    
    public Node<T> getRightNode() {
        return this.right;
    }
    
    public void setRightNode(Node<T> right) {
        this.right = right;
    }    
    
}
