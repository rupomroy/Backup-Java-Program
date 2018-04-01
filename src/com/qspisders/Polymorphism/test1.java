package com.qspisders.Polymorphism;

class A//call to method overload can be resolved during compile time based on the parameter we pass this is called compile time polymorphism//
{
	public static void run(String a, String b)
	{
		System.out.println(a+ " "+b);
	}
public static void run(String a, String b, String c)
{
	System.out.println(a+ " "+b+ " "+c);
}
}
public class test1 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
          //A.run("victor", "dey", "rupom");
	A.run("TCS","Google");
	}

}
