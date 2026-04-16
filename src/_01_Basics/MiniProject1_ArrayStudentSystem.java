package _01_Basics;

import java.util.Scanner;

// Topic: Mini Project 1 — Student Record System using Arrays
// Author: Om Tamrakar
// Summary: Demonstrates storing student names and marks using arrays.
// Description: This program stores student names and marks using arrays,
// calculates total, average, highest and lowest marks, and searches student records.

public class MiniProject1_ArrayStudentSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Number of students input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        // Step 2: Creating arrays
        String[] names = new String[n];
        int[] marks = new int[n];

        // Step 3: Taking input
        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine(); // clear buffer
        }

        // Step 4: Display student records
        System.out.println("\n===== Student Records =====");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " : " + marks[i]);
        }

        // Step 5: Calculate total
        int total = 0;

        for (int i = 0; i < n; i++) {
            total += marks[i];
        }

        // Step 6: Average
        double average = (double) total / n;

        // Step 7: Highest & Lowest marks
        int highest = marks[0];
        int lowest = marks[0];

        String topper = names[0];
        String lowestStudent = names[0];

        for (int i = 1; i < n; i++) {

            if (marks[i] > highest) {
                highest = marks[i];
                topper = names[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
                lowestStudent = names[i];
            }
        }

        // Step 8: Search student by name
        System.out.print("\nEnter student name to search: ");
        String searchName = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            if (names[i].equalsIgnoreCase(searchName)) {

                System.out.println("Student Found: " + names[i]);
                System.out.println("Marks: " + marks[i]);

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        // Step 9: Final summary
        System.out.println("\n===== Result Summary =====");

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest + " (" + topper + ")");
        System.out.println("Lowest Marks: " + lowest + " (" + lowestStudent + ")");

        sc.close();
    }
}