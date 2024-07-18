package com.practice;

public class OverRiding1 extends Over {
	
	public void Hdfc(String name) {
		 System.out.println(name);

		}
		
		public void Hdfc(int age) {
			
			System.out.println(age);
		}
	public static void main(String[] args) {
		
		OverRiding1 my=new OverRiding1();
		
		my.Hdfc(0);
		
		 
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	static
//		final  void one(String name,int age) {
//		System.out.println("our name is  "+ name);
//		System.out.println("age "+age);
//		
//
//	}
//	
//	public static  void one(int b) {
//		System.out.println(5);
//	}
//	public static void main(String[] args) {
//		
//				one("praveen", 25);
//				one(0);
//	}
//	
//}
