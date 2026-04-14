package _01_Basics;

import java.util.Scanner;

// Topic: User Input using Scanner
// Author: Om Tamrakar
// Description: Demonstrates how to take user input in Java using Scanner class

public class _06_UserInputScanner {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner sc = new Scanner(System.in);

        // ===============================
        // Taking String input
        // ===============================

        System.out.print("Enter your name: ");
        String name = sc.nextLine();


        // ===============================
        // Taking Integer input
        // ===============================

        System.out.print("Enter your age: ");
        int age = sc.nextInt();


        // ===============================
        // Taking Double input
        // ===============================

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();


        // ===============================
        // Printing user input
        // ===============================

        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        // Closing Scanner object
        sc.close();
    }
}