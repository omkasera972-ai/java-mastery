package _01_Basics;

import java.util.Scanner;

/**
 * Topic: 3D Arrays in Java (Complete Basics)
 * Author: Om Tamrakar
 * Description:
 * Demonstrates declaration, instantiation, initialization,
 * accessing elements, traversing arrays using three nested loops,
 * shortcut initialization, and taking 3D array input from user
 * using Scanner class.
 */

public class _11_ThreeDArray {

    public static void main(String[] args) {

        // ===============================
        // 1. ARRAY DECLARATION
        // ===============================

        int arr1[][][];


        // ===============================
        // 2. ARRAY INSTANTIATION
        // ===============================

        arr1 = new int[2][2][2];   // layer, row, column


        // ===============================
        // 3. ARRAY INITIALIZATION
        // ===============================

        arr1[0][0][0] = 10;
        arr1[0][0][1] = 20;

        arr1[0][1][0] = 30;
        arr1[0][1][1] = 40;

        arr1[1][0][0] = 50;
        arr1[1][0][1] = 60;

        arr1[1][1][0] = 70;
        arr1[1][1][1] = 80;


        // ===============================
        // 4. ACCESSING ARRAY ELEMENTS
        // ===============================

        System.out.println("Accessing Elements:");

        System.out.println(arr1[0][0][0]);
        System.out.println(arr1[0][0][1]);
        System.out.println(arr1[1][1][1]);


        // ===============================
        // 5. ARRAY TRAVERSING
        // ===============================

        System.out.println("\nTraversing 3D Array:");

        for(int i = 0; i < 2; i++) {        // layers

            for(int j = 0; j < 2; j++) {    // rows

                for(int k = 0; k < 2; k++) { // columns

                    System.out.print(arr1[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }


        // ===============================
        // 6. SHORTCUT INITIALIZATION
        // ===============================

        int arr2[][][] = {

                {
                        {1, 2},
                        {3, 4}
                },

                {
                        {5, 6},
                        {7, 8}
                }
        };

        System.out.println("Shortcut Initialized 3D Array:");

        for(int i = 0; i < arr2.length; i++) {

            for(int j = 0; j < arr2[i].length; j++) {

                for(int k = 0; k < arr2[i][j].length; k++) {

                    System.out.print(arr2[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }


        // ===============================
        // 7. ARRAY WITH USER INPUT
        // ===============================

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int userArr[][][] = new int[layers][rows][cols];

        System.out.println("Enter elements:");

        for(int i = 0; i < layers; i++) {

            for(int j = 0; j < rows; j++) {

                for(int k = 0; k < cols; k++) {

                    userArr[i][j][k] = sc.nextInt();
                }
            }
        }


        // ===============================
        // PRINT USER 3D ARRAY
        // ===============================

        System.out.println("\nUser Entered 3D Array:");

        for(int i = 0; i < layers; i++) {

            for(int j = 0; j < rows; j++) {

                for(int k = 0; k < cols; k++) {

                    System.out.print(userArr[i][j][k] + " ");
                }

                System.out.println();
            }

            System.out.println();
        }


        // Closing Scanner
        sc.close();
    }
}