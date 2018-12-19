package com.serialization_cloning;

import java.io.*;
public class CardWriter
 {
    public static void main(String[] args)
	 {
        
		String str=new String("this is the test string");
	
		try 
		{
	   		 FileOutputStream out = new FileOutputStream("String.txt");
	    		ObjectOutputStream oos = new ObjectOutputStream(out);
	    		oos.writeObject(str);
			System.out.println("writing complete");	
	   		 oos.flush();
		}
		 catch (Exception e)
		 {
	   	 	System.out.println("Problem serializing: " + e);
		}
    	}
}
