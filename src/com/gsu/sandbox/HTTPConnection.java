/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.sandbox;

/**
 *
 * @author Alexandre
 */

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;


public class HTTPConnection {
    

    private String url = "https://torchmarkcorp-redcarpet.silkroad.com/eprise/WebServices?WSDL";
    private String charset = "UTF-8";  // Or in Java 7 and later, use the constant: java.nio.charset.StandardCharsets.UTF_8.name()
    private String login = "<>";
    private String password = "<>";

    public String getReq() throws MalformedURLException, IOException {
        String query = String.format("login=%s&password=%s", 

        URLEncoder.encode(login, charset), 
        URLEncoder.encode(password, charset));

        URLConnection c = new URL(url + "?" + query).openConnection();
        c.setRequestProperty("Accept-Charset", charset);
        InputStream response = c.getInputStream();  

        return response.toString();
    }

    public static void main (String args[]) {
        HTTPConnection data = new HTTPConnection();
        
        String getString = null;
        try {
            getString = data.getReq();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.exit(1);
        }

        System.out.println( getString );
    }        
}
