package org.Loop;

public class Do_While_Loop {

	public static void main(String[] args) {
		int a = 10;
		int i = 1;

		do {
			int j = i;
			do {
				System.out.print(a + "  ");
				j++;
			} while (j <= 5);
			System.out.println();
			i++;
		} while (i <= a);
	}
}
