package com.qspiders.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Queue q1=new LinkedList();
      q1.add(10);
		q1.add(2);
		q1.add("java");
		q1.add('A');
		q1.add("rupom");
     System.out.println(q1);
     System.out.println(q1.poll()); //10
     System.out.println(q1.poll()); //2
     System.out.println(q1.poll()); //java
     System.out.println(q1); //[A, rupom]
     System.out.println(q1.size()); //2
     System.out.println(q1.poll()); //A
     System.out.println(q1.poll()); //rupom
     System.out.println(q1); //[]
    System.out.println(q1.poll()); //null
    System.out.println(q1.poll());  //null
}
}