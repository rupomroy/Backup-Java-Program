package com.qspiders.arrayone;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,5,7,2};
		int small=a[0];
		for(int k:a)
		{
			if(small>k)
			{
				small=k;
			}
		}
System.out.println(small);
			}
		

	}


