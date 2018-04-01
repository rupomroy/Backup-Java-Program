package com.qspiders.ExceptionOne;

public class Test20Exception {
	public static void fun()
	{
		try
		{
			throw new NullPointerException();
		}
		catch(NullPointerException NE)
		{
			System.out.println("exception");
			throw new NullPointerException();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			fun();
		}
      catch(NullPointerException NE)
		{
    	  System.out.println("null pointer exception");
		}		
	}

}
