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
public class GenericBinarySearchTree<T extends Comparable<T>> implements Tree<T> {
    
    private Node<T> root;
    private int size;
    
    public GenericBinarySearchTree() {
        this.root = null;
        this.size = 0;
    }
    

    @Override
    public void transverse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(T element) {
        
        Node<T> node = new Node<T>(element);
        
        if ( this.root == null ) {
            this.root = node;
            
        } else {
            insertNode(element, this.root);
        }
        
        size++;
    }
    
    private void insertNode(T newElement, Node<T> root) {
        // recursive method to insert a node on the left or on the right
        
        if ( newElement.compareTo(root.getNodeElement()) < 0 ) {
            if ( root.getLeftNode() != null) {
                insertNode(newElement, root.getLeftNode());                
                
            } else {
                Node<T> node = new Node<>(newElement);
                root.setLeftNode(node);
            }
            
        } else if ( newElement.compareTo(root.getNodeElement()) > 0) {
            if ( root.getRightNode() != null) {
                insertNode(newElement, root.getRightNode());                
                
            } else {
                Node<T> node = new Node<>(newElement);
                root.setRightNode(node);
            }
        } else { 
             throw new IllegalArgumentException("The value " + newElement.toString() + " is already in the list.");
        }
        
    }

    @Override
    public void remove(T element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public T max() {
        if ( this.root == null ) {
            return null;
            
        } else { 
            return getMaxNode(this.root);
        }        
    }
    
    private T getMaxNode(Node<T> root) {
        if (root.getRightNode() == null) {
            return root.getNodeElement();
            
        } else { 
            return getMaxNode(root.getRightNode());
        }
    }

    @Override
    public T min() {
        if ( this.root == null ) {
            return null;
            
        } else { 
            return getMinNode(this.root);
        }
    }
    
    private T getMinNode(Node<T> root) {
        if ( root.getLeftNode() == null) {
            return root.getNodeElement();
            
        } else { 
            return getMinNode(root.getLeftNode());
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return ( this.size == 0);
    }
    
    
}
