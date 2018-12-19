package com.exception;

class example1
{
	public static void main(String p[])
	{
		try
		{
			int d=1;
			System.out.println("with try and catch");
			int a=42/d;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println("hello"+e);
			
		}
	}
}
