package _02_OOP_Fundamentals;

/*
=========================================
Topic: Methods & Final Keyword
Author: Om Tamrakar

Covers:
- method without parameters
- method with parameters
- return type method
- method overloading
- final variable
- final method
- final class
=========================================
*/


final class Utility {

    void showMessage() {

        System.out.println("Final class example");
    }
}


class MethodExample {

    // final variable
    final double PI = 3.14159;


    // method without parameters
    void greet() {

        System.out.println("Welcome to Methods Example");
    }


    // method with parameters
    void showName(String name) {

        System.out.println("Student: " + name);
    }


    // method with return type
    int add(int a, int b) {

        return a + b;
    }


    // method overloading
    int multiply(int a, int b) {

        return a * b;
    }

    double multiply(double a, double b) {

        return a * b;
    }


    // final method example
    final void showFinalMethod() {

        System.out.println("Final method example");
    }
}


public class _05_MethodAnd_FinalKeyword {

    public static void main(String[] args) {

        MethodExample obj = new MethodExample();

        obj.greet();

        obj.showName("Om Tamrakar");

        System.out.println("Sum: " + obj.add(10, 20));

        System.out.println("Multiply int: " + obj.multiply(5, 4));

        System.out.println("Multiply double: " + obj.multiply(5.5, 2));

        System.out.println("PI value: " + obj.PI);

        obj.showFinalMethod();


        Utility u = new Utility();

        u.showMessage();
    }
}