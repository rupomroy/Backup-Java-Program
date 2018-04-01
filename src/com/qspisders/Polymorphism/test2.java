package com.qspisders.Polymorphism;

interface Bank
{
	public double getRateofinterest();
}
class Axis implements Bank
{
	public double getRateofinterest()
	{
		return 10.5;
	}
}
class Hdfc implements Bank
{
	public double getRateofinterest()
	{
		return 2.0;
	}
}
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  //Hdfc b1=new Hdfc();   //without upcasting
		Bank b1=new Hdfc();  //upcasting
		  System.out.println("rate of interest of hdfc is" + " " +b1.getRateofinterest());
Bank b2=new Axis();
System.out.println("rate of interest of axis is" +b2.getRateofinterest());

	}

}
