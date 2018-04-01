package com.qspiders.collections;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class Queue3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new LinkedList();
		q1.add(10);
		q1.add("java");
		q1.add(20);
		q1.add(30);
		System.out.println(q1);
		System.out.println(q1.peek()); //10
		System.out.println(q1.peek()); 
		System.out.println(q1.peek()); 
		System.out.println(q1.peek()); 
		System.out.println(q1.peek()); 
		System.out.println(q1);
		while(q1.peek()!=null)
		{
			System.out.println(q1.poll());
		}
	}

}
