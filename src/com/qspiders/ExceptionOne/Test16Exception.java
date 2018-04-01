package com.qspiders.ExceptionOne;

class Throwable
{
	public static void withdraw()
	{
		System.out.println("hello");
		throw new Test16Exception();
	}
}

public class Test16Exception extends ArithmeticException  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Throwable.withdraw();
		}
    catch(Test16Exception AE)
		{
    	System.out.println("practice example");
		}
	}

}
