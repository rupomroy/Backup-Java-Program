package com.qspiders.collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList a1=new ArrayList();
	a1.add(10);
	a1.add('A');
	a1.add("java");
	a1.add(10);
	a1.add(null);
	//System.out.println(a1); //[10, A, java, 10, null]
	//System.out.println(a1.isEmpty()); //false
	//System.out.println(a1.contains("java")); //true
     //System.out.println(a1.remove("java"));  //[10,A,10,null]
     a1.clear(); //[]
  System.out.println(a1); //[]
    
  
  //it is used to get the ouput in one by one line
	//for(int i=0;i<=a1.size()-1;i++)
	{//
		//System.out.println(a1);  //it will show 4 times [10, A, java, 10, null]
		//System.out.println(a1.get(i));
		//System.out.println(a1.isEmpty()); //false
		//System.out.println(a1.contains("java"));  //true
		

	}//

	}

}
