package com.gc;

public class CounterTest
 { 
	public static int count=0;
    	public CounterTest ( ) { count++; }
	public int main()
	   {
     		 CounterTest ob1 = new CounterTest ( ) ;
     		 System.out.println("Number of objects :" + CounterTest.count) ;
     		 CounterTest ob2 = new CounterTest ( );
		
     		 System.out.println("Number of objects :" + CounterTest.count) ; 
     		 
		Runtime r = Runtime.getRuntime( );
     		 ob1 = null;
     		 ob2 = null;
     		 r.gc( );
     		 System.out.println(count);
     		 return count;
	  }
	protected void finalize( )
  	 {
		
   		 System.out.println("Program about to terminate");
   		 CounterTest.count --;
   		 System.out.println("Number of objects :" + CounterTest.count) ;
  	 }
}











