/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.queues;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alexandre
 */
public class DirectoryQueue {
    
    public static void main(String[] args) {
        
        Queue<File> queue = new LinkedList<>();
        File rootDirectory = new File("C:/Temp/");
        
        queue.add(rootDirectory);
        
        while ( !queue.isEmpty()) {
            File directory = queue.remove();
            File[] files = directory.listFiles();
            
            if ( files != null ) {
                for ( int i = 0; i < files.length; i++) {
                    if ( files[i].isDirectory()) {
                        queue.add(files[i]);
                        
                    } else {
                        System.out.println(files[i].getAbsoluteFile());
                    }
                }                
            }
        }        
    }
    
}
