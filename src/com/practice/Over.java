package com.practice;

public class Over extends OverLoading {
	int name=5;
     int age=25;
   
    
	public void add(int name, int age) {
		System.out.println(name+age);
		
		System.out.println(this.name+super.age);
		

	}
	public void add1() {
		this.add(15, 5);
		super.add(15, 10);
		
	}
	public static void main(String[] args) {
		
		Over over=new Over();
		over.add(10, 5);
		
		
			
	
	
		
		
		
		
		
		
		
	}
	
}

