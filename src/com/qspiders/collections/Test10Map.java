package com.qspiders.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//put method is used to add the element in an Map
public class Test10Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h1=new HashMap();
		 h1.put(2, "pinky");
		 h1.put('A', "Rosy");
		 h1.put("ABCD", "FRUITY");
		 System.out.println(h1.get('A')); //rosy
		 System.out.println(h1);
		 Set S1=h1.entrySet();
		 Iterator i1=S1.iterator();
		 while(i1.hasNext())
		 {
			 System.out.println("values of data:" +i1.next());
		 }
			  
			  
		  }	  	
		}

//output will be in random order


