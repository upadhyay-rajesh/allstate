package com.exception;

class example3
{
	public static void main (String p[])
	{
		try
		{
			int a=1;
			System.out.println("a= "+a);
			int b=42/a;
			System.out.println(b);
			int c[]={1};
			c[42]=99;
		}
				
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array exception");
		}
		
		catch(Exception e)
		{
			System.out.println("arithmetic1 exception"+e);
		}
		
		
		
	}
}