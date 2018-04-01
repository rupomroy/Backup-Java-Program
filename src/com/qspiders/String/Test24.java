package com.qspiders.String;

//swap of two letters

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder S1=new StringBuilder("java developer");
		         char C1= S1.charAt(1);
		         S1.setCharAt(1, S1.charAt(S1.length()-2)); //r
		       S1.setCharAt(S1.length()-2, C1); //
		         System.out.println(S1);
		         
		        

	}

}
