package com.qspiders.String;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="java"; //string
		S1.concat("developer"); //if we want to concatenate add S1=s1.concat("developer");
		System.out.println(S1);
         StringBuffer S2=new StringBuffer("c"); //string buffer
         //S2.append("programming"); //string buffer
         //System.out.println(S2); //buffer
         System.out.println(S2.append("programming"));
         StringBuilder S3=new StringBuilder("Rupom"); //string builder
         S3.append("roi"); //string builder
         System.out.println(S3); //string builder
         
	}
}


