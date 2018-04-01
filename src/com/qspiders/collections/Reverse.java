package com.qspiders.collections;
//reverse a array. the method is used as Collections.reverse(a1);
import java.util.ArrayList;
import java.util.Collections;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList a1=new ArrayList();
   a1.add(1);
   a1.add(2);
   a1.add(3);
   System.out.println(a1);
 Collections.reverse(a1);
 for(int i=0;i<=a1.size()-1;i++)
 {
	 System.out.println(a1.get(i));
 }
 System.out.println(a1);
	}

}
