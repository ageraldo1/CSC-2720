/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.generic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class BoxTest {
    
    public static void main (String[] args) {
        
        List< Box<String> > boxes = new ArrayList<>();
        
        Box box = new Box<>();
        box.set("Value1");

        Box box2 = new Box<>();
        box2.set("Value2");
        
        boxes.add(box);
        boxes.add(box2);
        
        //String ret = boxes.get(0); // forced to cast
        Box ret = boxes.get(0);
        System.out.println (ret.getClass());
        System.out.println (box.getClass());
        
        
    }
    
    
    
    
    
}
