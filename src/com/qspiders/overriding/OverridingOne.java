package com.qspiders.overriding;

class A
{
	public void run()
	{
		System.out.println("good");
	}
}
class B extends A
{
	public void run()
	{
		System.out.println("morning");
}
}

public class OverridingOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B a1=new B();
      a1.run();
	}

}
