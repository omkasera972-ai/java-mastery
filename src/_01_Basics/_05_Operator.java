package _01_Basics;

// Topic: Operators in Java
// Author: Om Tamrakar
// Description: Demonstrates different types of operators in Java

public class _05_Operator {

    public static void main(String[] args) {

        // ===============================
        // 1. Arithmetic Operators
        // ===============================

        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // ===============================
        // 2. Relational Operators
        // ===============================

        System.out.println("\nRelational Operators:");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));


        // ===============================
        // 3. Logical Operators
        // ===============================

        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));


        // ===============================
        // 4. Assignment Operators
        // ===============================

        int num = 20;

        num += 5;
        System.out.println("\nAssignment Operator (+=): " + num);


        // ===============================
        // 5. Unary Operators
        // ===============================

        int value = 10;

        value++;
        System.out.println("Increment Operator (++): " + value);

        value--;
        System.out.println("Decrement Operator (--): " + value);
    }
}