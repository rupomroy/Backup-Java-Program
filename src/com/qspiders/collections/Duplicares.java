package com.qspiders.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Duplicares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet h1=new HashSet();
		//ArrayList h1=new ArrayList();
		h1.add(10);
		h1.add(10);
		h1.add(25);
		h1.add(5);
		h1.add(7);
		h1.add(100);
		h1.add(5);
		h1.add(2);
		h1.add(7);
	System.out.println(h1);
	System.out.println(Collections.frequency(h1, 10)); //already duplicates removed in hashset
		

	}

}
