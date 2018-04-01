package com.qspiders.collections;

import java.util.ArrayList;

//java program to find common elements between two arrays//  retain all for common elements between two arrays
public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(4);
		ArrayList a2=new ArrayList();	
           a2.add(3);
           a2.add(4);
           a2.add(5);
           a2.add(6);
           a2.add(7);
           a2.add(4);
           a1.retainAll(a2);
           System.out.println(a1);
	}

}
