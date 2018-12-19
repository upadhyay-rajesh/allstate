package com.exception;

class throwdemo
{
	static void demoproc()
	{
		try
		{
			throw new ArithmeticException ("demo");
		}
		catch(ArithmeticException e)
		{
			System.out.println("caught insidedemopro");
			throw e;
		}
	}
	public static void main(String p[])
	{
		try
		{
			demoproc();
		}
		catch(ArithmeticException e)
		{
			System.out.println("recaught"+e);
		}
	}
}

