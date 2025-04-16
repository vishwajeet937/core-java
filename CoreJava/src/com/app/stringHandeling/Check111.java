package com.app.stringHandeling;

import java.net.MalformedURLException;
import java.net.URL;

public class Check111 
{

	public static void main(String[] args) throws MalformedURLException
    {
        URL obj = new URL("https://www.sanfoundry.com/javamcq");
        System.out.print(obj.toExternalForm());
    }

}
