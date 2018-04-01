package com.qspisders.Polymorphism;

class F
{
	public void wish1()
	{
		System.out.println("hello is");
	}
}

class G extends F
{
	public void wish2()
	{
		System.out.println("hello how are you");
}
}

public class test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//G b1=new G();
//b1.wish1();
	//b1.wish2();	
    //F b2 =new G();
    //b2.wish2();//compile time error
  // b2.wish1();
    F b2 =new G();
   // b2.wish(); //method overriding with same method signature
      F b3=new G();
      b3.wish1();
	}
}
