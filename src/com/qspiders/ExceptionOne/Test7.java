package com.qspiders.ExceptionOne;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c;
		try
		{
		
			System.out.println(a/b);
		}
		catch(ArithmeticException AE)
		{
	      System.out.println(AE);
			System.out.println("Simple Try and Catch Example");
		}

	}

}
