package com.practice;

public class Methodes {
	static int a = 10;
	int b = 20;
	
	
	
	
	public int Methodes( int a) {
		System.out.println("constructor");
		return 60;
		
	}
	

	private void praveen() {
		m1(20, 30);
		m2();
		m3();
		System.out.println("printed successfully");
	}

	public int m1(int a, int b) {
		System.out.println(a + b);
		System.out.println(this.a + this.b);
		System.out.println("int return");
		return 25;
	}

	public static double m2() {
		System.out.println("print double");
		return 122.22;
	}

	public static String m3() {
		System.out.println("print string");
		return "praveen";
	}

	public static void main(String[] args) {
		Methodes call = new Methodes();
		int methodes = call.Methodes(12);
		System.out.println(methodes);
		call.praveen();
		int m1 = call.m1(2, 1);
		System.out.println(m1);
		double m2 = Methodes.m2();
		System.out.println(m2);
		String m3 = Methodes.m3();
		System.out.println(m3);

	}

}
