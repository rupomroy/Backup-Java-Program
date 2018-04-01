package com.qspiders.ExceptionOne;
//here we are downcasting superclass to subclass

class A
{
public void run()
{
	System.out.println("hello");
}
}
class B extends A
{
	public void wish()
	{
		System.out.println("sexy");
	}
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=(B) new A();  //downcasting 
		  

}
}
