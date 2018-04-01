package com.qspiders.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet t1=new TreeSet();
     t1.add(20);
     t1.add(30);
     t1.add(10);
     t1.add(5);
     t1.add(25);
     //t1.add("java");
     System.out.println(t1);
     Iterator r1=t1.iterator();
     while(r1.hasNext())
    		 {
    	 System.out.println(r1.next());
    		 }
     
	}

}
