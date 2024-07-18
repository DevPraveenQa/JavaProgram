package com.practice;

public class Variables {
	// class variable//instance variable
	static int a = 10;
	int b = 20;

	public static void main(String[] args) {

	Variables call=new Variables();
	call.add();
	System.out.println(call.a-call.b);
	
	

	}

	void add() {
     System.out.println(a+b);
	}

}
