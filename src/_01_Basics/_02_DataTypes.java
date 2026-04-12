package _01_Basics;

// Topic: Java Data Types
// Author: Om Tamrakar
// Description: Demonstrates primitive and non-primitive data types in Java

public class _02_DataTypes {

    public static void main(String[] args) {

        // ===============================
        // 1. Primitive Data Types in Java
        // ===============================

        int age = 20;                 // Integer type (whole numbers)
        double price = 99.99;         // Double type (decimal numbers)
        char grade = 'A';             // Character type (single character)
        boolean isJavaFun = true;     // Boolean type (true/false)
        byte smallNumber = 100;       // Byte type (very small integer)
        short temperature = 30;       // Short type (small integer)
        long population = 1400000000L; // Long type (large integer)
        float discount = 5.5f;        // Float type (decimal with less precision)

        // ===============================
        // 2. Non-Primitive Data Type
        // ===============================

        String name = "Om Tamrakar";  // String type (sequence of characters)

        // ===============================
        // 3. Output Section
        // ===============================

        System.out.println("Name (String): " + name);
        System.out.println("Age (int): " + age);
        System.out.println("Price (double): " + price);
        System.out.println("Grade (char): " + grade);
        System.out.println("Is Java Fun (boolean): " + isJavaFun);
        System.out.println("Small Number (byte): " + smallNumber);
        System.out.println("Temperature (short): " + temperature);
        System.out.println("Population (long): " + population);
        System.out.println("Discount (float): " + discount);
    }
}