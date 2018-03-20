/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.classwork.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alexandre
 */
public class ListExample {
    
    public static void main(String args[]) {
        String ret = null;
        List sampleList = new ArrayList();

        sampleList.add("var1");
        sampleList.add("var2");
        sampleList.add("var3");
        System.out.println (sampleList);
        
        // String ret = sampleList.get(0);   // compile error - need to force a cast in order to make it work
        
        ret = (String) sampleList.get(0);
        ret = sampleList.get(0).toString();
        
        // use raw type
        List<String> sampleList2 = new ArrayList<>();
        
        sampleList2.add("var4");
        sampleList2.add("var5");
        sampleList2.add("var6");
        
        ret = sampleList2.get(0); // no compile error ( no cast )
        
        Map<Integer, String> sampleMap = new HashMap<>();
        sampleMap.put(1, "value1");
        sampleMap.put(2, "value2");
        sampleMap.put(3, "value3");
        System.out.println (sampleMap);
        
        
        Map<Integer, List<String>> multiMap = new HashMap<>();
        multiMap.put(1, sampleList2);
        System.out.println (multiMap);
        
        
        
        
    }
    
}
