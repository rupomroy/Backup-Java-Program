package com.qspiders.collections;

import java.util.ArrayList;
import java.util.Collections;

// how many duplicates are there. eg. 5 is printed three times so output is 2.
public class duplicatesnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(5);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(4);
		a1.add(5);
		a1.add(1);
		System.out.println(Collections.frequency(a1, 1));  //syntax for duplicates
		
	}

}
