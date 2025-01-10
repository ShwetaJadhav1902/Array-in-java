package com.array;

public class Employee {
public static void main(String[] args) {
		
	int[]emp= {101,102,103,104,105};
	int[]emp1;
	int[]emp2=new int[5];
	emp2[0]=101;
	emp2[1]=102;
	emp2[2]=103;
	emp2[3]=104;
	emp2[4]=105;
	
	//for loop
	for(int i=0;i<emp2.length;i++){
		System.out.println("Employee Id:");
		System.out.println(emp2[i]);
		
		
	
}
	System.out.println("---------------------------------------------------------------------------------");
	
	//for each loop
	for(int i:emp)
	{
		System.out.println("Employee Id:");
		System.out.println(i);
	}
}
}
