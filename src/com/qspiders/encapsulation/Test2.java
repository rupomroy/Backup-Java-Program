package com.qspiders.encapsulation;

class Calender
{
	private int calendermonth;
	public int get()    //get method is used to get to retrieve the data
	{
		return calendermonth;
	}
		public int set(int calendermonth)
		{
			if(calendermonth>=1 && calendermonth<=12)
		this.calendermonth=calendermonth;
			else 
				System.out.println("invalid month");
		return calendermonth;
}
	}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calender a1=new Calender();
		a1.set(12);
		System.out.println(a1.get()); //12
		a1.set(17);//invalid month
		System.out.println(a1.get());//12

	}

}
