package com.qspiders.ExceptionOne;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		int c;
		int d;
		try
		{
			//c=a/b;
			d=a+b;
			//System.out.println(c);
			System.out.println(d);
		}
		catch(ArithmeticException AE)
		{
			System.out.println(AE);
			System.out.println("hello");
		}
		finally
		{
			System.out.println("rupom");
		}
	}
}
	
		