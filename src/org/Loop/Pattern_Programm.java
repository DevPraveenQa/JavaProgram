package org.Loop;

import java.util.Scanner;

public class Pattern_Programm {

	public static void main(String[]args) {
		
		System.out.println("normal squre star ");
		for(int i=1;i<=5;i++) { //mentioned rows
			for(int j=1;j<=5;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();	
			
		}
//		int a;
//			Scanner scanner= new Scanner(System.in);
//			System.out.println("enter number");
//			a=scanner.nextInt();
//			
			
		
		System.out.println("-------------------------");
		System.out.println("right side decrement traingle");
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
				
			}
			System.out.println("");
		}
		System.out.println("----------------");
	}

}
