package com.TryAndCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryAndCatchAndFinally {
	public static void main(String[] args) throws Exception {

		System.out.println("enter num");
		Scanner num = new Scanner(System.in);
		int nextInt = num.nextInt();
		try {
			int a = nextInt % 0;
			System.out.println(a);
		} catch (InputMismatchException e) {
			e.printStackTrace();
			throw new Exception("iput correct value");
			
		} catch (Exception e) {
			System.err.println("dsjgygdy");
		} finally {
          num.close();
		}
		System.out.println("ok");

	}

}
