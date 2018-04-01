package com.qspiders.collections;
 //program to find duplicates in a single array//
import java.util.ArrayList;
import java.util.HashSet;

public class duplicates3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList();
		a1.add("victor");
		a1.add("rupom");
		a1.add("ashish");
		a1.add("rupom");
		HashSet<String> h1=new HashSet();
	for(String k: a1)
		{
			if(h1.add(k)==false)  //based on the syntax
		System.out.println(k);
		}
		
	

	}

}
