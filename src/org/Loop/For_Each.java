package org.Loop;

public class For_Each {

	public static void main(String[] args) {

		int a = 10;
		int[] arr = new int[a];

		// Populate the array with values from 1 to a
		for (int i = 0; i < a; i++) {
			arr[i] = i + 1;
		}

		for (int num : arr) {
			for (int j = num; j <= 5; j++) {
				System.out.print(a + "  ");
			}
			System.out.println();
		}
	}
}
