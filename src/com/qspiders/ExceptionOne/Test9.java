package com.qspiders.ExceptionOne;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S1=new Scanner(System.in); //Scanner is the class name
		System.out.println("enter the first number");
		int a=S1.nextInt(); //method
		System.out.println("enter the second number");
		int b=S1.nextInt();
		while(true)
		{
			try
			{
				System.out.println(a/b);
			break;
		
			}
			catch(ArithmeticException AE)
			{
				System.out.println(AE); //if we dont print AE then it will not show the reason for exception
				System.out.println("denominator cannot be zero please type again");
				b=S1.nextInt();
			}
		}

	}

}
