package com.qspiders.collections;

import java.util.ArrayList;
import java.util.Iterator;



//joining of two array using arraylist
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(20);
		a1.add(30);
		a1.add(40);
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add(50);
		a2.add(60);
		a2.add(70);
		System.out.println(a2);
		//adding of both the array
		a1.addAll(a2);
		System.out.println(a1);
		//using iteration 
		Iterator i1=a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
