package com.qspiders.String;
//without using boolean
public class Test28 {
	String name;
	int age;
	public Test28(String name, int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test28 S1=new Test28("rupom", 31);
		Test28 S2=new Test28("victor", 32);
		System.out.println(S1.equals(S2));
		

	}

}
//output is false