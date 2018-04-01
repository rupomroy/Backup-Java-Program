package com.qspiders.collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test11Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap k1=new LinkedHashMap();
		k1.put(2, "rupom");
		k1.put(3, "victor");
		k1.put("rupomroy", 2);
           System.out.println(k1);
           System.out.println(k1.get(3)); //victor
           Set S1=k1.entrySet();
           Iterator i1=S1.iterator();
           System.out.println(S1);  // [2=rupom, 3=victor, rupomroy=2]
           while(i1.hasNext())
           {
        	   System.out.println(i1.next());
           }
	}

}
