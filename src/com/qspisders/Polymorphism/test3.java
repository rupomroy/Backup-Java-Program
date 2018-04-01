package com.qspisders.Polymorphism;
//call by r
class A1 {
	void test() {
		System.out.println("Inside test() of class A");
	}
}
class B extends A1{
	void test() {
		System.out.println("Inside test() of class B");
	}
}
class C extends B{
	void test() {
		System.out.println("Inside test() of class C");
	}
}

class D{

	void sample(A1 a) //pass by reference , here A1 is the class name, a is the reference variable of A1 type.
	{
		a.test(); 
	}
}
public class test3 {
	public static void main(String[] args) {
		D d=new D();		
		d.sample(new A1());
		A1 a = new A1();
		d.sample(new B());
		d.sample(new C());
	}

}
