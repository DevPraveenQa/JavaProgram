package com.practice;

public class For_Loop {
	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int brr[][] = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < brr.length; i++) {
			for (int j = 0; j < brr[i].length; j++) {
				System.out.print(brr[i][j] + " ");

			}
			System.out.print("---'''");
		}
	}
}
