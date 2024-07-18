package org.Loop;

public class For_Loop {

	public static void main(String[] args) {

		int a = 5;
		// increacing triangle
		
		System.out.println("increacing triangle");
		// outer loop !
		for (int i = 1; i <= a; i++) { //outer loop mentioned to rows
			// inner loop
			for (int j = 1; j <= a; j++) {// inneer loop mentioned to columns
				System.out.print("*" + "  ");
			}
       	System.out.println();

		}
//		System.out.println("decreacing triangle");
//		for (int i = 1; i <= a; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*" + "  ");// decreacing triangle
//			}
//			System.out.println();
//		}
//		System.out.println("right sight increacing traiangle");
//		for (int i = 1; i <=a; i++) {
//			for(int j=a;j>i;j--) {
//				System.out.print("");
//			
//			}
//			for(int k=1;k<=i;k++) {
//				System.out.print("*"+" ");
//				}
//			System.out.println();
//		}
//		System.out.println("Right-sided increasing triangle:");
//        for (int i = 1; i <= a; i++) {
//            // Print spaces
//            for (int j = a; j >= i; j--) {
//                System.out.print(" ");
//            }
//
//            // Print stars
//            for (int k = 1; k <= i; k++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
	}
}