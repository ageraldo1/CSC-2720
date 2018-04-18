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
    public void transverse(transversalOrder order) {
        if ( this.root != null) {
            if ( order == transversalOrder.IN) {
                doInTransverse(this.root);
                
            } else if ( order == transversalOrder.PRE) {
                doPreTransverse(this.root);
                
            } else if ( order == transversalOrder.POST) {
                doPostTransverse(this.root);
            }
        }
    }
    
    private void doInTransverse(Node<T> root) {
        
        if (root.getLeftNode() != null ) doInTransverse(root.getLeftNode());

        System.out.print(root.getNodeElement() + ", ");

        if ( root.getRightNode() != null ) doInTransverse(root.getRightNode());        
    }
    
    private void doPostTransverse(Node<T> root) {
        if (root.getLeftNode() != null ) doPostTransverse(root.getLeftNode());
        
        if ( root.getRightNode() != null ) doPostTransverse(root.getRightNode());        
        
        System.out.print(root.getNodeElement() + ", ");
    }
    
    private void doPreTransverse(Node<T> root) {
        System.out.print(root.getNodeElement() + ", ");

        if (root.getLeftNode() != null ) doPostTransverse(root.getLeftNode());
        if ( root.getRightNode() != null ) doPostTransverse(root.getRightNode());        
    }

    @Override
    public void insert(T element) {
        
        Node<T> node = new Node<>(element);
        
        if ( this.root == null ) {
            this.root = node;
            
        } else {
            insert(element, this.root);
        }
        
        size++;
    }
    
    private void insert(T newElement, Node<T> root) {
        // recursive method to insert a node on the left or on the right
        
        if ( newElement.compareTo(root.getNodeElement()) < 0 ) {
            if ( root.getLeftNode() != null) {
                insert(newElement, root.getLeftNode());                
                
            } else {
                Node<T> node = new Node<>(newElement);
                root.setLeftNode(node);
            }
            
        } else if ( newElement.compareTo(root.getNodeElement()) > 0) {
            if ( root.getRightNode() != null) {
                insert(newElement, root.getRightNode());                
                
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
        Node<T> node = contains(element, this.root);
        
        if ( node == null ) {
            throw new IllegalArgumentException("The value " + element.toString() + " does not exists.");
            
        } else { 
            remove(node);
            this.size--;           
        }        
    }
    
    private void remove (Node<T> node) {
        
        if ( node.getLeftNode() == null && node.getRightNode() == null ) { // case 1 : leaf node
            Node<T> parent = getParent(node.getNodeElement());

            if ( node.getNodeElement().compareTo(parent.getNodeElement()) < 0 ) {
                parent.setLeftNode(null);

            } else {
                parent.setRightNode(null);
            }

            node = null;

        } else if ( node.getLeftNode() != null & node.getRightNode() == null) { // case 2 : one single child on the left
            Node<T> parent = getParent(node.getNodeElement());

            parent.setLeftNode(node.getLeftNode());
            node = null;          

        } else if ( node.getLeftNode() == null & node.getRightNode() != null) { // case 2 : one single child on the right
            Node<T> parent = getParent(node.getNodeElement());

            parent.setRightNode(node.getLeftNode());
            node = null;            

        } else { // case 3: node has 2 children
            Node<T> successor = getSuccessor(node.getRightNode());            
            
            remove(node.getRightNode());
            
            node.setNodeElement(successor.getNodeElement());            
        }            
        
    }

    @Override
    public T max() {
        if ( this.root == null ) {
            return null;
            
        } else { 
            return max(this.root);
        }        
    }
    
    private T max(Node<T> root) {
        if (root.getRightNode() == null) {
            return root.getNodeElement();
            
        } else { 
            return max(root.getRightNode());
        }
    }

    @Override
    public T min() {
        if ( this.root == null ) {
            return null;
            
        } else { 
            return min(this.root);
        }
    }
    
    private T min(Node<T> root) {
        if ( root.getLeftNode() == null) {
            return root.getNodeElement();
            
        } else { 
            return min(root.getLeftNode());
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

    @Override
    public T getRoot() {
        if ( this.root == null ) {
            return null;
        } else { 
            return this.root.getNodeElement();
        }
    }

    @Override
    public boolean contains(T element) {
        return (contains(element, this.root) != null);
    }
    
    private Node<T> contains(T element, Node<T> root) {
        
        if ( root == null ) {
            return null;
            
        } else {             
            int direction = element.compareTo(root.getNodeElement());
            
            if ( direction < 0 ) {
                 return contains(element, root.getLeftNode());
                 
            } else if ( direction > 0 ) {
                return contains(element, root.getRightNode());
                
            } else {
                return root;
            }
        }
    }
    
       
    private Node<T> getParent(T element) {
        if ( !contains(element)) throw new IllegalArgumentException("The value " + element.toString() + " does not exists.");
        
        Node<T> parent = null;
        Node<T> node   = this.root;
        
        while ( node != null) {
            if ( element.compareTo(node.getNodeElement()) < 0 )  {
                parent = node;
                node   = node.getLeftNode();
                
            } else if ( element.compareTo(node.getNodeElement()) > 0 ) {
                parent = node;
                node   = node.getRightNode();
                
            } else { 
                break;
            }
        }
        
        if ( parent == null ) {
            return node;
            
        } else { 
            return parent;
        }
    }
    
    
    private Node<T> getPredecessor(Node<T> root) {
       if ( root.getRightNode() != null )  {
           return getPredecessor(root.getRightNode());
           
       } else {
           return root;
       }        
    }
    
    private Node<T> getSuccessor(Node<T> root) {
        if ( root.getLeftNode() == null) {
            return root;
            
        } else { 
            return getSuccessor(root.getLeftNode());
        }
    }
    
    
    
}
