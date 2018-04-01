package com.qspiders.typecasting;
class E
{
	public void run()
	{
		System.out.println("victor");
	}
}
class F extends E
{
	public void wish()
	{
		System.out.println("dey");
	}
}
public class DownCasting {
public static void main(String[] args) {
	E e1=new F();
	F f1=(F)e1;
	f1.run();
	f1.wish();
	
		
	}

}
