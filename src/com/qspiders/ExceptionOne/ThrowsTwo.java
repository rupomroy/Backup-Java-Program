package com.qspiders.ExceptionOne;

public class ThrowsTwo {

	public static void display() throws NullPointerException
	{
		System.out.println("how are you");
		throw new ArithmeticException();		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			display();
		}
		catch(ArithmeticException AE)
		{
			System.out.println("hello");
		}

	}

}



