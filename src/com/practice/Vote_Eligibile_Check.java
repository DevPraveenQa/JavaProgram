package com.practice;

import java.util.Scanner;

public class Vote_Eligibile_Check {

	public static void main(String[] args) {

		int num;
		Scanner scanCall = new Scanner(System.in);
		System.out.println("Enter Your Age =");

		num = scanCall.nextInt();

		if (num >= 18 && num <=60) {

			System.out.println("eligible for vote");
		
		} 
		else {
			System.out.println("'sorry'---not eligible for vote");
		}

	}

}
