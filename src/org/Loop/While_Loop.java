package org.Loop;

public class While_Loop {

	public static void main(String[] args) {
		int a = 10;
		int i = 1;

		while (i <= a) {
			int j = i;
			while (j <= 5) {
				System.out.print(a + "  ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
