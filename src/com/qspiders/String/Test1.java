package com.qspiders.String;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String S1="rupom";
      String S2="rupom";
      System.out.println(S1==S2); //Output True because of boolean
      String S3=new String("rupom");
      String S4=new String("rupom");
      System.out.println(S3==S4); //Output is false because of boolean
      System.out.println(S1.toUpperCase());
	}
	
}
