/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.arrays;

/**
 *
 * @author Alexandre
 */
public class Tester {
    static CustomArrayList aList = new CustomArrayList();
    
    public static void main(String args[]) {
        showStats();
        
        aList.add(1);
        aList.add(2);
        aList.add(3);

        //showStats();
        aList.add(4);
        aList.add(5);
        showStats();
        
        System.out.println("Removing object index..: [0] = " + aList.get(0));

        aList.remove(0);
        //aList.set(4, null);
        showStats();
        
        //aList.add(6);
        //showStats();
        
      
        
       // aList.remove(4);
        //showStats();
        
    }
    
    public static void showStats() {
        System.out.println("*********************************************");
        System.out.println("Array size.......:" + aList.size());
        System.out.println("Array is full....:" + aList.isFull());
        System.out.println("Array is Empty...:" + aList.isEmpty());
        System.out.println("Array............:" + aList.toString());
        System.out.println("*********************************************\n");        
    }
}
