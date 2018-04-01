package com.qspiders.String;

public class Test26 {
	String name;
	int age;
	int number;
	public Test26(String name, int age, int number) //parameter
	{
		this.name=name;
		this.age=age;
		this.number=number;
	}
	public String toString()
	{
		return "student name is "+name + "number is" +number + "age is" +age;
	}
 	
	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test26 T1=new Test26("rupom",12,13);
		Test26 T2= new Test26("victor", 13,14);
		System.out.println(T1);
		System.out.println(T2);

	}

}
