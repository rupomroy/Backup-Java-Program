package com.qspiders.collections;

import java.util.LinkedList;

public class Queue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> q1=new LinkedList();
		q1.add("orange");
		q1.add("mango");
		System.out.println(q1);
		System.out.println(q1.poll()); //orange
		System.out.println(q1.poll()); //mango
		System.out.println(q1.size()); //0
		System.out.println(q1.poll());//null
		System.out.println(q1);
		
	   
		
	}

}
