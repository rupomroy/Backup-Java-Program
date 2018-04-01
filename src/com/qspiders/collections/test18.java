package com.qspiders.collections;
//How do you retrieve an element from a particular position of an ArrayList?
	//How do you replace a particular element in an ArrayList with the given element?	
import java.util.ArrayList;

public class test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add(111);
a1.add(222);
a1.add(333);
a1.add(444);
System.out.println(a1); //[111, 222, 333, 444]
System.out.println(a1.indexOf(222)); //1
System.out.println(a1.get(2)); //333
a1.set(2, 100);  //it should be writen outside the println
System.out.println(a1);
a1.set(3, 1000);
System.out.println(a1); //[111, 222, 100, 1000]
	}

}
