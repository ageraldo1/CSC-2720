/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.assignments;

/**
 *
 * @author Alexandre
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


public class GradesExample {
    
public static void main(String[] args) throws IOException {
        FileWriter array = new FileWriter("C:/TEMP/testfile.txt");
        BufferedWriter thelists = new BufferedWriter(array); 
       
PrintWriter out = new PrintWriter(thelists);
     
Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
       
        int q = input.nextInt();
        int[] array1 = new int[q];
        for(int i = 0; i < q; i++) {
            System.out.println("Enter the student #" + (i+1) + "'s name then 4 scores: ");
            String name1 = input.next();
           
            double s1 = input.nextDouble();
            double s2 = input.nextDouble();
            double s3 = input.nextDouble();
            double s4 = input.nextDouble();
            double avgscore = (s1+s2+s3+s4)/4;
            
           out.write( avgscore+"  "+name1);
         out.write("\r\n");
    
        }
        out.close();
        
        BufferedReader reader = null; 
         
        BufferedWriter writer = null;
     
        ArrayList<String> lines = new ArrayList<String>();
         
        try
        {
      
            reader = new BufferedReader(new FileReader("C:/TEMP/testfile.txt"));
        
            String currentLine = reader.readLine();
             
            while (currentLine != null) 
            {
                lines.add(currentLine);
                 
                currentLine = reader.readLine();
            }
         
            Collections.sort(lines, Collections.reverseOrder());
           
            writer = new BufferedWriter(new FileWriter("C:/TEMP/sortedfile.txt"));
          
            for (String line : lines)
            {
                writer.write(line);
                 
                writer.newLine();
            }
            
        } 
        
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        finally
        {
          
            try
            {
                if (reader != null)
                {
                    reader.close();
                }
                 
                if(writer != null)
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
           
        }
        System.out.println("Top 3 highest avrage scores are");
        System.out.println(lines.get(0));
        System.out.println(lines.get(1));
        System.out.println(lines.get(2));
     
}    
    
    
}
