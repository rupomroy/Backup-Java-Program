package com.qspiders.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet l1=new LinkedHashSet();
		l1.add(10);
		l1.add("java");
        l1.add(20);
        l1.add("rupom");
        System.out.println(l1);
        Iterator i1=l1.iterator();
        	while(i1.hasNext())
        	{
        		System.out.println(i1.next()); // it will be in the same order
        	}
        		}
        
        }



