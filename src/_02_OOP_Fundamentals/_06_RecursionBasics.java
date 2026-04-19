package _02_OOP_Fundamentals;

/*
=========================================
Topic: Recursion Basics (Easy → Intermediate)

Covers:
- print numbers
- factorial
- sum of digits
- fibonacci

Recursion = method calling itself
Base condition stops infinite calls
=========================================
*/

public class _06_RecursionBasics {

    // print numbers from 1 to n
    static void printNumbers(int n) {

        if (n == 0)
            return;

        printNumbers(n - 1);

        System.out.print(n + " ");
    }


    // factorial using recursion
    static int factorial(int n) {

        if (n == 1)
            return 1;

        return n * factorial(n - 1);
    }


    // sum of digits using recursion
    static int sumOfDigits(int n) {

        if (n == 0)
            return 0;

        return (n % 10) + sumOfDigits(n / 10);
    }


    // fibonacci using recursion (intermediate level)
    static int fibonacci(int n) {

        if (n <= 1)
            return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {

        System.out.print("Numbers: ");
        printNumbers(5);

        System.out.println("\nFactorial: " + factorial(5));

        System.out.println("Sum of Digits: " + sumOfDigits(1234));

        System.out.println("Fibonacci: " + fibonacci(6));
    }
}