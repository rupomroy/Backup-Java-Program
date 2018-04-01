package com.qspiders.collections;

import java.util.ArrayList;

//How do you insert more than one element at a particular position of an ArrayList?
public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		ArrayList a2=new ArrayList();
		a2.add(50);
		a2.add(60);
		a2.add(70);
		a2.add(80);
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(2, a2);
		System.out.println(a1);
		

	}

}
