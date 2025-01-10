package com.array;

public class basicarray {
	public static void main(String[] args) {
		
		int[]arr={23,34,54,74,43};
		int[]arr1;
		
		int arr2[]=new int[5];
		arr2[0]=14;
		arr2[1]=54;
		arr2[2]=13;
		arr2[3]=15;
		arr2[4]=16;
		
		for(int i=0;i<=arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("=========================================================================");
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
