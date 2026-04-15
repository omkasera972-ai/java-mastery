package _01_Basics;

import java.util.Scanner;

/* Topic: 1D Arrays in Java (Complete Basics)
Author: Om Tamrakar
Description: Demonstrates declaration, instantiation, initialization,
accessing elements, traversing arrays, and performing operations on
1D arrays both without user input and with user input using Scanner class. */

/*
 This is a multiline comment
*/

public class _09_OneDArray {

    public static void main(String[] args) {

        // ===============================
        // 1. ARRAY DECLARATION
        // ===============================

        int arr1[];   // Declaration


        // ===============================
        // 2. ARRAY INSTANTIATION
        // ===============================

        arr1 = new int[5];   // Instantiation (memory allocation)


        // ===============================
        // 3. ARRAY INITIALIZATION
        // ===============================

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;


        // ===============================
        // 4. ACCESSING ARRAY ELEMENTS
        // ===============================

        System.out.println("Accessing Elements:");

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);


        // ===============================
        // 5. ARRAY TRAVERSING
        // ===============================

        System.out.println("\nTraversing Array:");

        for(int i = 0; i < arr1.length; i++) {

            System.out.println(arr1[i]);
        }


        // ===============================
        // 6. ARRAY USING SHORTCUT INITIALIZATION
        // ===============================

        int arr2[] = {5, 15, 25, 35, 45};

        System.out.println("\nShortcut Initialized Array:");

        for(int i = 0; i < arr2.length; i++) {

            System.out.println(arr2[i]);
        }


        // ===============================
        // 7. FINDING SUM OF ARRAY ELEMENTS
        // ===============================

        int sum = 0;

        for(int i = 0; i < arr2.length; i++) {

            sum += arr2[i];
        }

        System.out.println("\nSum of elements: " + sum);


        // ===============================
        // 8. FINDING MAXIMUM ELEMENT
        // ===============================

        int max = arr2[0];

        for(int i = 1; i < arr2.length; i++) {

            if(arr2[i] > max) {

                max = arr2[i];
            }
        }

        System.out.println("Maximum element: " + max);


        // ===============================
        // 9. ARRAY WITH USER INPUT
        // ===============================

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");

        int size = sc.nextInt();

        int userArr[] = new int[size];

        System.out.println("Enter array elements:");

        for(int i = 0; i < size; i++) {

            userArr[i] = sc.nextInt();
        }


        // ===============================
        // PRINT USER ARRAY
        // ===============================

        System.out.println("\nUser Entered Array:");

        for(int i = 0; i < size; i++) {

            System.out.println(userArr[i]);
        }


        sc.close();
    }
}