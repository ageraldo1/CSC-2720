/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.abstraction;

/**
 *
 * @author Alexandre
 */
public class Tester {
    
    public static void main (String args[]) {
        
        GameObject[] console = new GameObject[2];
        
        GameObject player = new Player();
        GameObject menu = new Menu();
        
        console[0] = player;
        console[1] = menu;
        
        for (GameObject elements: console) {
            elements.draw();
        }

        
       
    }
    
}
