package com.qspiders.encapsulation;

class A
{
	private String name;
	public String get()
	{
		return name;
		
	}
	public String set(String name)
	{
		this.name=name;
		return name;
		
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A();
//a1.get();
//System.out.println(a1.get());
a1.set("victor");
System.out.println("the boy is" +a1.get());
	}

}
