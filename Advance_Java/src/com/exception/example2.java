package com.exception;

class example2
{
	public static void main(String p[])
	{
		int d,a;
		try
		{
			d=0;
			a=42/d;
			System.out.println( "this will notbeprinted ");
		}
		catch(Exception e)
		{
			System.out.println("division by zero");
		}
		}
}
