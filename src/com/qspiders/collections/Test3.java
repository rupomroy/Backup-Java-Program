package com.qspiders.collections;

import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1=new Vector(); //vector increases the size by double
		a1.add(10);
		a1.add("java");
		a1.add(20);
		a1.add(0, 50); 
		System.out.println(a1); //it will shift the position
		a1.set(2, "victor");
		System.out.println(a1);
		

	}

}
