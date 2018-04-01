package com.qspiders.constructors;

public class constructorOverloading {
	public constructorOverloading(int a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public constructorOverloading(int a, int b, String name)
	{
	   System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}

	public static void main(String[] args) {
		constructorOverloading a1=new constructorOverloading(4,5);
		constructorOverloading a2=new constructorOverloading(6, 7, "victordey");
	}
}
