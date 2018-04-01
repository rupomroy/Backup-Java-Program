package com.qspiders.collections;

import java.util.ArrayList;

// How do you remove all elements of an ArrayList at a time?
public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list=new ArrayList();
list.add("AAA");
list.add("BBB");
list.add("ccc");
list.add("DDD");
list.add("e");
System.out.println(list);
list.clear();
System.out.println(list); //for any method we have to write println
	}

}
