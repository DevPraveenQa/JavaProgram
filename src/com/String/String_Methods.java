package com.String;

public class String_Methods {

	public static void main(String[] args) {

		String age = new String("      'My Name Is PraveeN' ");
		String age1 = new String("        'MY Name Is PraveeN' ");

		
		char charAt = age.charAt(14);
		System.out.println(charAt);
		
		int codePointAt = age.codePointAt(2);
		System.out.println(codePointAt);
		
		boolean equals = age.equals(age1);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = age.equalsIgnoreCase(age1);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = age.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = age.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = age.startsWith("M");
		System.out.println(startsWith);
		
		boolean endsWith = age.endsWith("N");
		System.out.println(endsWith);
		
		boolean contains = age.contains("Praveen");
		System.out.println("contains ="+contains);
		
		int indexOf = age.indexOf("e");
		System.out.println("indexOf ="+indexOf);
		
		int lastIndexOf = age.lastIndexOf("P");
		System.out.println("lastIndexOf ="+lastIndexOf);
		
		String replace = age.replace("PraveeN", "Leela");
		System.out.println("replace ="+replace);
		
		String substring = age.substring(4);
		System.out.println("SUBSTRING1 ="+substring);
		
		String substring2 = age.substring(2, 6);
		System.out.println("substring2 ="+substring2);
		
		boolean empty = age1.isEmpty();
		System.out.println(empty);
		
		
		String furieds ="apple ,orange.banana";
		
		String[] split = furieds.split("");
		
		for (String string : split) {
			System.out.println(string);
		}
		
		
		String age3 ="dell laptoPU";
		String age4 ="dell laptop";
		String age5 ="dell Laptop";
		System.out.println("TRIM = "+age.trim());
		String trim = age.trim();
		System.out.println(trim);
		
		
		int compareTo = age3.compareToIgnoreCase(age4); 
		System.out.println(compareTo);
		int compareToIgnoreCase = age3.compareToIgnoreCase(age5);
		System.out.println("compareToIgnoreCase ="+compareToIgnoreCase);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		char a = name.charAt(4);
//		System.out.println(a);
//		System.out.println(name.charAt(0));
//		System.out.println("---------------------------------");
//		IntStream chars = name.chars();
//		System.out.println(chars);
//		System.out.println("---------------------------------");
//		int length = age.length();
//		System.out.println(length);
//		System.out.println("---------------------------------");
//		boolean equals = age.equals(name);
//	    System.out.println(equals);
//	    System.out.println("---------------------------------");
//	    boolean equalsIgnoreCase = name.equalsIgnoreCase(age);
//	    System.out.println(equalsIgnoreCase);
//	    String upperCase = name.toUpperCase();
//	    System.out.println(upperCase);
//	    System.out.println("---------------------------------");
//	    String lowerCase = name.toLowerCase();
//	    System.out.println(lowerCase);
//	    System.out.println("----------------------------------");
//	    boolean startsWith = name.startsWith("M");
//	    System.out.println(startsWith);
//	    System.out.println("----------------------------------");
//	    boolean endsWith = name.endsWith("n");
//	    System.out.println(endsWith);
//	    System.out.println("---------------------------------");
//	    int indexOf = name.indexOf("N");
//	    System.out.println("indexof is  "+ indexOf);
//	    System.out.println("-------------------------------");
//	    int lastIndexOf = name.lastIndexOf("N");
//	    System.out.println(lastIndexOf);
	}

}
