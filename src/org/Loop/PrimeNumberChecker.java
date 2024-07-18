package org.Loop;

import java.util.Scanner;

public class PrimeNumberChecker {
	
	    public static void main(String[] args) {
	      
	    	Scanner day=new Scanner(System.in);
	    	System.out.println("enter (a,e,i.o.u)");
	    	String nextLine = day.nextLine();
	    	
	    	switch (nextLine) {
			case "A":
		
				System.out.println("monday");
				break;
			case "B":
				System.out.println("tuesday");
				break;
//			case 3:
//				System.out.println("thursday");
//				break;
//			case 4:
//				System.out.println("wednesday");
//				break;
//			case 5:
//				System.out.println("friday");
//				break;
//			case 6:
//				System.out.println("saturday");
//				break;
//			case 7:
//				System.out.println("sunday");
//break;

			default:
				System.out.println("enter corect number");
				break;
			}
	    }

		private static int equalsIgnoreCase(String nextLine) {
			
			return 0;
		}
	}
