/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.heap;

import java.util.Arrays;

/**
 *
 * @author Alexandre
 */
public class Sample {
    
    private static class HeapNode<T extends Comparable> {
        T item;
        
        public HeapNode(T item) {
            this.item = item;
        }
        
        public void setItem(T item) {
            this.item = item;
        }
        
        public T getItem() {
            return this.item;
        }
        
        public int compare(T obj) {
            return (this.item.compareTo(obj));
        }
    }
    
    public static void main (String[] args) {
        HeapNode<Integer>[] item = new HeapNode[3];
        
        item[0] = new HeapNode<>(1);
        item[1] = new HeapNode<>(2);
        item[2] = new HeapNode<>(3);
        
        System.out.println (item[0].compare(item[1].item));
        
        Integer[] arr = new Integer[] { 4, 6, 1, 2, 9, 9, 10, 4, 2 };
        String[] str = new String[] { "1" };
                
        
        insertionSort(arr);
        insertionSort(str);
        
        //insertionSort(item);
    }
    
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[i]) < 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    
}
    

