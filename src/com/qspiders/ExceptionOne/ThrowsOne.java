package com.qspiders.ExceptionOne;

public class ThrowsOne {
	
	 public static void display() throws InterruptedException 
	   {
		   for(int i=0;i<=10;i++)
		   {
			   System.out.println(i);
			   Thread.sleep(1000);
		   }
	   }
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			display();
		}
		catch(InterruptedException  IE) 
		{
			System.out.println("exception caught");
		}
  
	}

}
