package com.qspiders.collections;

import java.util.ArrayList;

//How do you convert an ArrayList to Array?
public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(6);
		System.out.println(a1);
		for(int i=0;i<=a1.size()-1;i++)
		{
			System.out.println(a1.get(i));
		}

	}

}
