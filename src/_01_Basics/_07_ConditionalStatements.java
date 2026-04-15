package _01_Basics;

import java.util.Scanner;

// Topic: Conditional Statements using Scanner
// Author: Om Tamrakar
// Description: Demonstrates if-else, else-if ladder, and switch case in Java

public class _07_ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===============================
        // 1. IF - ELSE (Voting Check)
        // ===============================

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You are NOT eligible to vote");
        }


        // ===============================
        // 2. ELSE-IF LADDER (Grade System)
        // ===============================

        System.out.print("\nEnter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }


        // ===============================
        // 3. SWITCH CASE (Day Finder)
        // ===============================

        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        // Closing Scanner
        sc.close();
    }
}