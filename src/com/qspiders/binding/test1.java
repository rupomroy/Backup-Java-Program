package com.qspiders.binding;

class A
{
	public void run()
	{
		System.out.println("hello good morning");
	}
}
class B extends A
{
	public void run()
	{
		System.out.println("hello good evenings");
	}
}
public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new B();  // Upcasting, subclasss object is passed to super class object reference//
   a1.run();
		B b1=new B();
		b1.run();
	}

}
