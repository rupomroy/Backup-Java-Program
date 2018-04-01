package com.qspiders.collections;
//java program to find common elements between two arrays using hashset. 
//Hashset does not allow duplicates//
import java.util.ArrayList;
import java.util.HashSet;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashSet a1=new HashSet();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		a1.add(5);
		a1.add(4);
		HashSet a2=new HashSet();
           a2.add(3);
           a2.add(4);
           a2.add(5);
           a2.add(6);
           a2.add(7);
           a2.add(4);
           a1.retainAll(a2);
           System.out.println(a1);
	}

}
