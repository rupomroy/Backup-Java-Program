package com.qspiders.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q1=new LinkedList();
		q1.add(10);
		q1.add(2);
		q1.add('A');
		q1.add("java");
		//System.out.println(q1);
		while(q1.peek()!=null) //when it will become null it will come out of the loop.
		{
			System.out.println(q1.poll());
		}
		
		}		

	}


