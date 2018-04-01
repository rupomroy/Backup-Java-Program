package com.qspiders.String;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="java";
		System.out.println(S1.equals("java")); //true //equals method is overriden
   StringBuffer S2=new StringBuffer("java"); //false because equals method is not overridden
   System.out.println(S2.equals("java"));
   StringBuilder S3=new StringBuilder("java");
   System.out.println(S3.equals("java")); //false because equals method is not overriden
	}

}
