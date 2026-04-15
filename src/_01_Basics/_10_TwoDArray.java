package _01_Basics;

import java.util.Scanner;

/**
 * Topic: 2D Arrays in Java (Complete Basics)
 * Author: Om Tamrakar
 * Description:
 * Demonstrates declaration, instantiation, initialization,
 * accessing elements, traversing arrays, shortcut initialization,
 * and taking matrix input from user using Scanner class.
 */

public class _10_TwoDArray {

    public static void main(String[] args) {

        // ===============================
        // 1. ARRAY DECLARATION
        // ===============================

        int arr1[][];


        // ===============================
        // 2. ARRAY INSTANTIATION
        // ===============================

        arr1 = new int[2][3];   // 2 rows, 3 columns


        // ===============================
        // 3. ARRAY INITIALIZATION
        // ===============================

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[0][2] = 30;

        arr1[1][0] = 40;
        arr1[1][1] = 50;
        arr1[1][2] = 60;


        // ===============================
        // 4. ACCESSING ARRAY ELEMENTS
        // ===============================

        System.out.println("Accessing Elements:");

        System.out.println(arr1[0][0]);
        System.out.println(arr1[0][1]);
        System.out.println(arr1[0][2]);
        System.out.println(arr1[1][0]);
        System.out.println(arr1[1][1]);
        System.out.println(arr1[1][2]);


        // ===============================
        // 5. ARRAY TRAVERSING
        // ===============================

        System.out.println("\nTraversing 2D Array:");

        for(int i = 0; i < 2; i++) {

            for(int j = 0; j < 3; j++) {

                System.out.print(arr1[i][j] + " ");
            }

            System.out.println();
        }


        // ===============================
        // 6. SHORTCUT INITIALIZATION
        // ===============================

        int arr2[][] = {

                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\nShortcut Initialized Matrix:");

        for(int i = 0; i < arr2.length; i++) {

            for(int j = 0; j < arr2[i].length; j++) {

                System.out.print(arr2[i][j] + " ");
            }

            System.out.println();
        }


        // ===============================
        // 7. 2D ARRAY WITH USER INPUT
        // ===============================

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int userArr[][] = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                userArr[i][j] = sc.nextInt();
            }
        }


        // ===============================
        // PRINT USER MATRIX
        // ===============================

        System.out.println("\nUser Entered Matrix:");

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                System.out.print(userArr[i][j] + " ");
            }

            System.out.println();
        }


        // Closing Scanner
        sc.close();
    }
}