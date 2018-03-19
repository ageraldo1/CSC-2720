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
public class Sample {
    public static void main (String args[]) {
        
        //A a = new D();
        //a.m();

        //A d = new D();
        //d.m();
        
        A sample = new C();
        sample.m();
    }

}

class A {
    public void m() {
        System.out.println("I am A class");
    };
}

class B extends A {
    public void m() {
        System.out.println("I am B class");
    };
}

class C extends B {
    public void m() {
        System.out.println("I am C class");
    };
}

class D extends C {
    public void m() {
        System.out.println("I am D class");
    };
}
