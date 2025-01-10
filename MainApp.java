package com.array;

public class MainApp {
	public static void main(String[] args)
	{
		MyDate d1=new MyDate();
		MyDate d2=new MyDate(1,1,2002);
		
		System.out.println(d1);
		System.out.println(d2);
		
		swap(d1,d2);
	}
	static void swap(MyDate dd1,MyDate dd2) 
	{
		MyDate temp=dd1;
		dd1=dd2;
		dd2=temp;
		System.out.println("After Swapping");
		System.out.println(dd1);
		System.out.println(dd2);
	}

}
