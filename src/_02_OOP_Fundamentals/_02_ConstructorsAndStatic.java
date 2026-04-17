package _02_OOP_Fundamentals;

/* ===============================
Topic: Constructors and Static in Java
Phase: OOP Fundamentals (Phase 2)

Summary:
Demonstrates default, parameterized, and copy constructors,
static variables, static methods, and static vs instance members.

Description:
Counter class shows static variable shared across all objects.
Student class shows all three constructor types and this() chaining.
Static method is called without object using className.method().
Instance method needs object to be called.
=============================== */


// ===============================
// 1. STATIC VARIABLE & METHOD
// ===============================
// static = belongs to CLASS, not to object
// shared across ALL objects of the class
class Counter {

    // ===============================
    // 2. STATIC VARIABLE
    // ===============================
    static int count = 0;   // shared by all objects


    // ===============================
    // 3. CONSTRUCTOR (updates static variable)
    // ===============================
    Counter() {
        count++;   // every new object increases count
    }


    // ===============================
    // 4. STATIC METHOD
    // ===============================
    // static method: called using class name, no object needed
    static void showCount() {
        System.out.println("Total objects created: " + count);
    }
}


// ===============================
// 5. CONSTRUCTOR TYPES
// ===============================
class Student {

    String name;
    int grade;


    // ===============================
    // 6. DEFAULT CONSTRUCTOR
    // ===============================
    // No parameters — sets default values
    Student() {
        this.name = "Unknown";
        this.grade = 0;
        System.out.println("Default constructor called");
    }


    // ===============================
    // 7. PARAMETERIZED CONSTRUCTOR
    // ===============================
    // Takes arguments — sets custom values
    Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        System.out.println("Parameterized constructor called");
    }


    // ===============================
    // 8. COPY CONSTRUCTOR
    // ===============================
    // Takes another object — copies its values
    Student(Student other) {
        this.name = other.name;
        this.grade = other.grade;
        System.out.println("Copy constructor called");
    }


    // ===============================
    // 9. INSTANCE METHOD
    // ===============================
    // instance method: needs object to be called
    void display() {
        System.out.println("Name: " + name + " | Grade: " + grade);
    }
}


// ===============================
// 10. MAIN CLASS
// ===============================
public class _02_ConstructorsAndStatic {

    public static void main(String[] args) {

        // ===============================
        // 11. STATIC VARIABLE DEMO
        // ===============================
        System.out.println("=== Static Demo ===");

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Called using class name, no object needed
        Counter.showCount();


        System.out.println();


        // ===============================
        // 12. DEFAULT CONSTRUCTOR
        // ===============================
        System.out.println("=== Default Constructor ===");

        Student s1 = new Student();
        s1.display();


        System.out.println();


        // ===============================
        // 13. PARAMETERIZED CONSTRUCTOR
        // ===============================
        System.out.println("=== Parameterized Constructor ===");

        Student s2 = new Student("Rahul", 10);
        s2.display();


        System.out.println();


        // ===============================
        // 14. COPY CONSTRUCTOR
        // ===============================
        System.out.println("=== Copy Constructor ===");

        Student s3 = new Student(s2);   // copies s2 into s3
        s3.display();
    }
}