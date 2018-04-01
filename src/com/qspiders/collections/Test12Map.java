package com.qspiders.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test12Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap k1=new TreeMap();
		k1.put(2, "rupom");
	    k1.put(3, "victor");
		k1.put(4, 2);
           System.out.println(k1);
           System.out.println(k1.get(3)); //victor
           Set S1=k1.entrySet();  //converts map to set
           Iterator i1=S1.iterator();
           System.out.println(S1);  // [2=rupom, 3=victor, 4=2]
           while(i1.hasNext())
           {
        	   System.out.println(i1.next());
           }
	}

}
