package com.qspiders.collections;

import java.util.ArrayList;

//How do you get the position of a particular element in an ArrayList?
public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a1=new ArrayList();
a1.add("JAVA");
a1.add("J2EE");
a1.add("JSP");
a1.add("JAVA");
a1.add("SERVLETS");
a1.add("JAVA");
a1.add("STRUTS");
System.out.println(a1); //[JAVA, J2EE, JSP, JAVA, SERVLETS, JAVA, STRUTS]//
System.out.println(a1.indexOf("JAVA"));
System.out.println(a1.lastIndexOf("JAVA"));




	}

}
