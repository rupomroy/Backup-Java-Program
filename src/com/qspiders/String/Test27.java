package com.qspiders.String;

public class Test27 {
	String Fname;
	String Lname;
	int age;
	int rollno;
	char c;
	public Test27(String Fname, String Lname, int age, int rollno, char c)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		this.age=age;
		this.rollno=rollno;
		this.c=c;
	}
	public String toString() 
	{
		//return "first name is "+Fname + "\t " + "last name is" + "\t  "+Lname +  " \t" +"age is" + "\t "  +age + "\t"+"rollno is" + " \t " +rollno + " \t" + "character is" + " " +c;
		//return "first name is "+Fname + "\n" + "last name is" + "\t  "+Lname +  " \n" +"age is" + "\t "  +age + "\n"+"rollno is" + " \t " +rollno + " \n" + "character is" + " " +c; // /n is used to Print in next Line
		return "First Name is - "+Fname + "\n" + "Last Name is - " + " "+Lname +  " \n" +"Age is - " + " "  +age + "\n"+"Roll No is - " + " " +rollno + " \n" + "Character is - " + " " +c;
	} 
	
	public static void main(String[] args) {  
		// TODO Auto-generated method stub
         Test27 T1=new Test27("VICTOR", "DEY", 31, 17, 'M');
         System.out.println(T1);
	}

}
