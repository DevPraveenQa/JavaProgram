package com.practice;

public class OverLoading {
	
	
	int name=20;
    int age=25;

	public  void add() {
		System.out.println("non paramitarized");
	}

	public  void add(int a, int b) {
		System.out.println(a + b);

	}

	public static void add(String a) {
	System.out.println(a);

	}

	public static void main(String[] args) {

//		add();
//		add(3, 0);
//		OverLoading.add(0, 0);
//		add("praveen");

	}
}