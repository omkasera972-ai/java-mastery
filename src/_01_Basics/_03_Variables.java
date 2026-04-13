package _01_Basics;

public class _03_Variables {

// Topic: Variables in Java
// Author: Om Tamrakar

    public static void main(String[] args) {

        // ===============================
        // 1. Variable Declaration
        // ===============================

        int age;          // declaring variable
        age = 20;         // initializing variable

        // ===============================
        // 2. Variable Declaration + Initialization Together
        // ===============================

        double salary = 25000.50;

        // ===============================
        // 3. Multiple Variables Declaration
        // ===============================

        int x = 10, y = 20, z = 30;

        // ===============================
        // 4. Constant Variable using final keyword
        // ===============================

        final double PI = 3.141592653589793;

        // ===============================
        // 5. Printing Variables
        // ===============================

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Values of x, y, z: " + x + ", " + y + ", " + z);
        System.out.println("Constant PI value: " + PI);
    }
// Description: Demonstrates declaration, initialization, and usage of variables
}

