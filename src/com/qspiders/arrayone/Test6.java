package com.qspiders.arrayone;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {10,15,9,36};
		int big=a[0];
		for(int k:a)
		{
			if(big<k)
			{
			big=k;
			}
		}
			System.out.println(big);
		
		}

	}


