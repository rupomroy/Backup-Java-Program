package com.qspiders.constructors;

public class ConstructorOverloadingOne {
	int a;
	int b;
	String name; //variable declarartion

	public ConstructorOverloadingOne(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public ConstructorOverloadingOne(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name; //assigning the value of constructor to instance member of the class
		
	}

	public void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorOverloadingOne a1 = new ConstructorOverloadingOne(6, 7, "rupom");
		ConstructorOverloadingOne a2 = new ConstructorOverloadingOne(1, 2);
	a1.display();
	a2.display();

	}

}
