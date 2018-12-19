package com.serialization_cloning;

import java.io.*;
public class CardReader {
    public static void main(String[] args) {
	String str=null;

	try {
	    FileInputStream in = new FileInputStream("String.txt");
	    ObjectInputStream ois = new ObjectInputStream(in);
	    str = (String)(ois.readObject());
	} catch (Exception e) {
	    System.out.println("Problem serializing: " + e);
	}

	System.out.println("Card read is: "+str);

    }
}
