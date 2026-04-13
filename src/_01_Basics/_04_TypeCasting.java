package _01_Basics;

// Topic: Type Casting in Java
// Author: Om Tamrakar
// Description: Demonstrates implicit and explicit type casting in Java

public class _04_TypeCasting {

    public static void main(String[] args) {

        // ===============================
        // 1. Implicit Type Casting (Widening)
        // smaller data type → larger data type
        // ===============================

        int number = 100;
        double convertedNumber = number; // automatic conversion

        System.out.println("Implicit Type Casting Example:");
        System.out.println("Original int value: " + number);
        System.out.println("Converted double value: " + convertedNumber);


        // ===============================
        // 2. Explicit Type Casting (Narrowing)
        // larger data type → smaller data type
        // ===============================

        double price = 99.99;
        int convertedPrice = (int) price; // manual conversion

        System.out.println("\nExplicit Type Casting Example:");
        System.out.println("Original double value: " + price);
        System.out.println("Converted int value: " + convertedPrice);


        // ===============================
        // 3. Character to Integer Conversion Example
        // ===============================


        char grade = 'A';
        int gradeValue = grade;

        System.out.println("\nCharacter to Integer Conversion:");
        System.out.println("Character value: " + grade);
        System.out.println("ASCII value of character: " + gradeValue);
    }
}