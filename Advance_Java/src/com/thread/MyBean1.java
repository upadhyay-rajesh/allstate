package com.thread;


import java.awt.*;
import java.util.*;
import java.applet.Applet;
public class MyBean1 extends Applet implements Runnable
{
	Thread t ;
	String str;int x;
	public MyBean1()	
	{
		setSize(100,100);
		setBackground(Color.white);
		setForeground(Color.red);
		str= "L and T InFotech";
		x=100;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
			
			repaint();
			
			try
			{
				t.sleep(50);
			}
			catch(Exception e){}
		}
	}
	public void paint(Graphics g)
	{
		g.drawString(str,x,120);
		x=x+5;
		
		
	}
	
}








