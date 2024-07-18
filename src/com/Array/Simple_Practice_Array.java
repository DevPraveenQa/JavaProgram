package com.Array;

public class Simple_Practice_Array {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40};
		  System.out.println(a.length);
		   
		  System.out.println("----------");
		
		  for (int i : a) {
			System.out.println(i);    //use to for loop
		}
		
		System.out.println("---------------");

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);      //use to for each loop
		}
		
		
	}

}
