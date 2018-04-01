package com.qspiders.constructors;

public class DefaultConstructor {
	String name;
	public DefaultConstructor()
	{
		name="rose";
		System.out.println(name);
	}

	public static void main(String[] args) {
		DefaultConstructor d1=new DefaultConstructor();
		DefaultConstructor d2=new DefaultConstructor();
	}

}
