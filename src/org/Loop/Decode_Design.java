package org.Loop;

public class Decode_Design {

	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				if (i <= j) {
					System.out.print("*"
							);
					
					
				}
				if (i > j) {
					System.out.print(" ");
				}

			}
			System.out.println();

		}

	}

}
