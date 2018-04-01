package com.qspiders.collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		a1.add(60);
		a1.add(4, 100); //it will not shift it will just replace //[10, 20, 30, 40, 100, 50, 60]
		System.out.println(a1);
		a1.set(5, 600);  // it will override the existing element //[10, 20, 30, 40, 100, 600, 60]
		System.out.println(a1);
		//ArrayList a2=(ArrayList) a1.clone();
				//System.out.println("cloned arraylist:"  + a2);
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}   
		a1.set(1, 25);
		System.out.println(a1);
		
	}
}

		
