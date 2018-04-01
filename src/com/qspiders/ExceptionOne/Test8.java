package com.qspiders.ExceptionOne;

import java.util.Scanner;
//scanner program
public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in); //scanner is the class name
		System.out.println("enter the first number");
		int a=S1.nextInt(); //next.int is the method
		System.out.println("enter the second number");
		int b=S1.nextInt();
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException AE) 
		{
			System.out.println(AE); //AE is used to define the errors
	System.out.println("rupom");
			
			
		}

	}

}
