package com.practice;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a vowel (a, e, i, o, u):");
        String input = scanner.nextLine(); // Convert the input to lowercase for case-insensitive comparison
        
        switch (input) {
            case "a":
                System.out.println("Monday");
                break;
            case "e":
                System.out.println("Tuesday");
                break;
            case "i":
                System.out.println("Wednesday");
                break;
            case "o":
                System.out.println("Thursday");
                break;
            case "u":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid input! Please enter a vowel (a, e, i, o, u).");
        }
    }
}
