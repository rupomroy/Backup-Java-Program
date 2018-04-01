package com.qspiders.typecasting;

 class A {
	public void run()
	{
		System.out.println("rupom");
	}
}
class B extends A
{
	public void wish()
	{
		System.out.println("roy");
	}
}
class UpCasting
{
	public static void main(String[] args) {
		A a1=new B();
		//a1.wish(); //CTE COMPILE TIME ERROR//
		a1.run();

	}

}
