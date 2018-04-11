/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.trees;

import java.util.Stack;

/**
 *
 * @author Alexandre
 * @param <E>
 */
public class GenericBinaryTree<E extends Comparable<E>> {
    
    private TreeNode<E> rootNode;
    private int size;
    
    class TreeNode<E> {
        E element;
        TreeNode<E> left;
        TreeNode<E> right;
        
        public TreeNode() {
            this.element = null;
            this.left = null;
            this.right = null;
        }
        
        public TreeNode(E element, TreeNode<E> left, TreeNode<E> right) {
            this.element = element;
            this.left = left;
            this.right = right;
        }
        
        
        
        
    }
    
    public GenericBinaryTree() {
        this.rootNode = null;
        this.size = 0;
    }
    
    public void transverse(TreeNode root) {
        
        if ( root == null) {
            // return
            
        } else { 
            System.out.println (root.element);
            transverse(root.left);
            transverse(root.right);
        }
        
    }
    
    public void transverse() {
        if ( this.rootNode == null) {
            // return
        } else {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(this.rootNode);
            
            TreeNode<E> tempNode;
            
            while ( !stack.isEmpty ()) {
                tempNode = stack.pop();
                
                System.out.println (tempNode.element);
                
                if ( tempNode.right != null ) {
                    stack.push(tempNode.right);
                }
                
                if ( tempNode.left != null ) {
                    stack.push (tempNode.left);
                }
            }
        }
    }
    
    public void add(E element) {
        
        TreeNode<E> newNode = new TreeNode(element, null, null);
        
        if ( this.rootNode == null ) {
            this.rootNode = newNode;
            
        } else { 
            int direction = compareTo(rootNode.element, newNode.element);
            
            if ( direction == 0 ) { 
                // node already exists
                
            } else if ( direction < 0 ) {
                // tranveserse insert the node on the left
                
            } else { 
                // insert the node on the right
            }
            
            // when rootNode is not null
            //    add the newNode to the left when the new value is less than rootNode.value
            //    add the newNode to the right when the new value is greater than rootNode.value
        }
        
        this.size++;
    }
    
    public <E extends Comparable<E>> int compareTo(E source, E target) {
        if ( source.compareTo(target) > 0 ) { 
            return 1;
            
        } else if ( source.compareTo(target) < 0 ) {
            return -1;
            
        } else {
            return 0;
        }
    }
    
}
