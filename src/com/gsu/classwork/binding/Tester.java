/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.binding;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        System.out.println ("Static Binding"); // defined the object during compile - explicity
        
        Student student = new Student();
        student.talk(); // will call show method on Student class
        
        Person person = new Person();
        person.talk(); // will call show method on Person class
        
        
        System.out.println ("Dynamic Binding"); // defined the object during runtime
        Person sample2 = new Student();
        sample2.talk(); // will call show method on Student class
        
        // ERROR : Student sample3 = new Person(); // compile error
        
        
        
               
               
                
                
    }
    
}
