package _03_OOP_Advance;

/*
 JVM MEMORY DEMO

 Demonstrates:
 Stack Memory
 Heap Memory
 Static Memory (Method Area)
 Object Creation Flow
*/

public class _01_JVM_Memory {

    // Static variable → stored in Method Area
    static String company = "TechCorp";

    public static void main(String[] args) {

        int x = 10;  // stored in Stack Memory

        Student s1 = new Student("Om", 101);   // object stored in Heap
        Student s2 = new Student("Rahul", 102);

        s1.show();
        s2.show();

        display(x);
    }


    // Method call → Stack Frame created
    static void display(int value) {

        System.out.println("Stack value: " + value);
        System.out.println("Company: " + company);
    }


    // Object stored in Heap Memory
    static class Student {

        String name;
        int id;

        Student(String name, int id) {

            this.name = name;
            this.id = id;
        }

        void show() {

            System.out.println(id + " " + name);
        }
    }
}