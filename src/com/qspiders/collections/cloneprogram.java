package com.qspiders.collections;

import java.util.ArrayList;

//How do you find the number of elements present in an ArrayList?//
public class cloneprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(1.1);
		a1.add(2.1);
		a1.add(3.1);
		a1.add(4.1);
		a1.add(5.1);
		ArrayList a2 = (ArrayList) a1.clone();
		System.out.println("clone of the a1"+ a2);
	}

}
