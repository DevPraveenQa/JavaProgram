package com.PatternProgrrams;

public class Squire_Design1 {

	public static void main(String[] args) {

		for (int i = 3; i>=1; i--) {// row
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}

	}
}


// i=1 1<=3 true    j=1 1<=1 true  * 
//					j=2 2<=1 false 

// i=2 2<=3 true    j=1 1<=2 true  * *  
//                  j=2 2<=2 true   
//                  j=3 3<=2 false

//i=3 3<=3 true    j=1 1<=3 true  * * * 
//				   j=2 2<=3 true   
//				   j=3 3<=3 true 

 

//right side decrement

//i=3   3>=1 true j=1  1<=3 true * * *
//                 j=2  2<=3 true
 //                  j=3  3<=3 true 
//                   j=4   4<=3 false

//i=2  2>=1  true  j=1  1<=2 true * *
//                 j=2  2<=2 true
//                 j=3  3<=2 false
//

//i=1  1>=1  true  j=1  1<=1 true * 
//                 j=2  2<=1 false
             
//i=0  0<=0  false 


//i=1 1<=3  true  j=1  1<=2  true  11
//				  j=2 2<=2	true	  
//                j=3  3<=2   fals

//i=2 2<=3  true  j=1  1<=2  true  22
//				  j=2 2<=2	true	  
//				  j=3  3<=2   fals

//i=3 3<=3  true  j=1  1<=2  true  33
//				  j=2 2<=2	true	  
//				  j=3  3<=2   fals