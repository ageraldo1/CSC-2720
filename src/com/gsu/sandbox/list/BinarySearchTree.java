/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox.list;

/**
 *
 * @author Alexandre
 * @param <T>
 */
public class BinarySearchTree<T extends Comparable<T>> {
    
    private class Node<T extends Comparable<T>> {
        
        private T data;
        private Node<T> left;
        private Node<T> right;
        
        public Node(T element) {
            this.data = element;
            this.left = null;
            this.right = null;
        }
        
        @Override
        public String toString() {
           return this.data.toString();
        }
    }
    
    private Node<T> root;
    
    public void insert(T element) {
        if ( this.root == null ) {
            this.root = new Node<>(element);
            
        } else {
            insert ( element, this.root);
        }
    }
    
    private void insert (T element, Node<T> node) {
        if ( element.compareTo(node.data) < 0) {
            if ( node.left != null ) {
                insert ( element, node.left);
                
            } else { 
                node.left = new Node<>(element);
            }
            
        } else if ( element.compareTo(node.data) > 0 ) {
            if (node.right != null ) {
                insert (element, node.right);
                
            } else { 
                node.right = new Node<>(element);
            }
        } else {
            throw new IllegalArgumentException("The value " + element + " is already in the list.");
        }
    }
    
    public T getMax() {
        if ( this.root == null) {
            return null;
            
        } else { 
            return getMax(this.root);
        }        
    }
    
   private T getMax(Node<T> node) {
       if ( node.right != null ) {
           return getMax ( node.right);
           
       } else { 
           return node.data;
       }
   }
   
   public T getMin() {
       if ( this.root == null ) {
           return null;
           
       } else { 
           return getMin(this.root);
       }
   }
   
   private T getMin(Node<T> node) {
       
       if ( node.left != null ) {
           return getMin (node.left);
           
       } else { 
           return node.data;
       }
   }
   
   public void transverse() {
       // in order 
       // left -> root -> right
       
       if ( this.root != null) {
           transverse(this.root);
       }
   }
   
   private void transverse(Node<T> node) {
       if ( node.left != null ) transverse ( node.left);
       
       System.out.print ( node.data + " ");
       
       if ( node.right != null ) transverse ( node.right);
   }
   
   public void remove(T element) {
       if ( this.root != null) {
           remove (element, this.root);
       }       
   }
   
   private void remove(T element, Node<T> node) {
       
   }
   
   
    
    
    
}
