package com.qspiders.collections;

import java.util.ArrayList;

//How do you remove an element from a particular position of an ArrayList?
public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add("AAA");
		list.add("BBB");
		list.add("ccc");
		list.add("DDD");
		list.add("e");
		System.out.println(list);
		list.remove(4);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);

	}

}
