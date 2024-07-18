package org.Loop;

public class Practice {

	public static void main(String[] args) {

	

		        int rows = 3; // You can change this to adjust the height of the pyramid
		        
		        for (int i = 1; i <= rows; i++) {
		         for (int j = rows; j<=1; j++) {
		        	 System.out.print(i+" ");
					
				}
		         System.out.println();
		        }
		    }
		}

//i=1   1<=3 true  j=1 1<=3 true    1234 
//                 j=2 2<=3 true    1234
//                 j=3 3<=3 true   
//                 j=4 4<=3 false  

//i=1   1<=3 true  j=1 1<=3 true   1  
//                 j=2 2<=3 true   1
//                 j=3 3<=3 true   1
//                 j=4 4<=3 false  

