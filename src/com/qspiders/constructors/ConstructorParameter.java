package com.qspiders.constructors;

public class ConstructorParameter {
	public ConstructorParameter(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorParameter p1=new ConstructorParameter("victor");
		ConstructorParameter p2=new ConstructorParameter("dey");
	}

}
