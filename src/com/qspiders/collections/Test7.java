package com.qspiders.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet();
		h1.add(10);
		h1.add(20);
		h1.add(50);
		h1.add(5);
		//System.out.println(h1);
		Iterator i1=h1.iterator(); //like upcasting
		while(i1.hasNext())
		{
			System.out.println(i1.next()); //output will be on random order
		}
		
	}

}
