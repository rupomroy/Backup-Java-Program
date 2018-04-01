package com.qspiders.ExceptionOne;
//try with 
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=0;
		String S1=null;
		try
		{
			System.out.println(a/b);		
			System.out.println(S1.length());
			
			
		}
catch(ArithmeticException AE)
		{
	System.out.println(AE);
	System.out.println("arithmetic Exceptions");
		}
		catch(NullPointerException AE)
		{
			System.out.println(AE);
			System.out.println("Null Pointer exceptions");
		}
	}

}
