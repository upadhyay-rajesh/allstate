package com.thread;

class example
{	
	public static void main(String p[])
	{
		Thread t = Thread.currentThread();
		System.out.println("current thread:"+t);
		t.setName("my thread");
		System.out.println("after name changed:"+t);
	}
}
