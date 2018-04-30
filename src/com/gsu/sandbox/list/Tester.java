/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox.list;

import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Alexandre
 */
public class Tester {
//    static class A {
//        public A() {
//            System.out.println("At A constructor");
//        }
//        
//        public void show() {
//            System.out.println ("At A class");
//        }
//    }
    
//    static class B extends A {
//        public B() {
//            System.out.println ("At B constructor");
//        }
        
//        public void show() {
//            System.out.println ("At B class");
//        }
        
        
    //}
    
    public static void main (String[] args) {
        
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        
        tree.insert(10);
        tree.insert(-1);
        tree.insert(1);
        tree.insert(0);
        tree.insert(1000);
        tree.insert(-22);
        
        System.out.println ( tree.getMax());
        System.out.println ( tree.getMin());
        tree.transverse();
        System.out.println();
        
//        IteratorDemo<String> list = new IteratorDemo<>();
//        list.add("Alex");
//        list.add("Joe");
//        list.add("Moe");
//        list.add("Homer");
//        System.out.println (list);
//        
//        Iterator it = list.iterator();
//        
//        while ( it.hasNext()) {
//            System.out.println (it.next());
//        }
        
        
//        A obj = new B();
//        obj.show();
//        
        
//        Queue queue = new Queue();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        
//        System.out.println (queue.dequeue());
//        System.out.println (queue.dequeue());
//        System.out.println (queue.dequeue());
//        Stack stack  = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        System.out.println (stack.peek());
//        
//        System.out.println (stack.pop());
//        System.out.println (stack.pop());
//        
//         System.out.println (stack.peek());
        
//        Random rand = new Random();
//        
//        LinkedList<Integer> list = new LinkedList<>();
//        
//        for ( int i = 0; i < 10; i++) {
//            list.insert(rand.nextInt(99));
//        }
//        
//        System.out.println(list.size());
//        list.transverse();

    



    }
    
}

