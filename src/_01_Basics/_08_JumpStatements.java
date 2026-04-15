package _01_Basics;

// Topic: Jump Statements in Java
// Author: Om Tamrakar
// Description: Demonstrates return, break, and continue statements

public class _08_JumpStatements {

    public static void main(String[] args) {

        // ===============================
        // 1. RETURN STATEMENT
        // ===============================

        System.out.println("Before return statement");

        checkNumber(10);

        System.out.println("After method call");


        // ===============================
        // 2. BREAK STATEMENT
        // ===============================

        System.out.println("\nBreak Example:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break; // stops loop completely
            }

            System.out.println(i);
        }


        // ===============================
        // 3. CONTINUE STATEMENT
        // ===============================

        System.out.println("\nContinue Example:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue; // skips 5 only >> work - skip
            }

            System.out.println(i);
        }
    }

    // Method for return statement example
    public static void checkNumber(int num) {

        if (num > 5) {
            System.out.println("Number is greater than 5");
            return; // exits method immediately
        }

        System.out.println("Number is 5 or less");
    }
}