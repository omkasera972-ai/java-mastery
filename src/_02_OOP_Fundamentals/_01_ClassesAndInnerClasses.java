package _02_OOP_Fundamentals;

/* ===============================
Topic: Classes and Inner Classes in Java
Phase: OOP Fundamentals (Phase 2)

Summary:
Demonstrates creation of outer class and non-static inner class,
object creation, constructors, instance variables, and method usage.

Description:
This program explains how an outer class works along with a non-static
inner class. It shows how the inner class can access outer class fields
directly and how objects of both classes are created and used together.
=============================== */


// ===============================
// 1. OUTER CLASS DEFINITION
// ===============================
class School {

    // ===============================
    // 2. FIELDS (Instance Variables)
    // ===============================
    String schoolName;
    int year;


    // ===============================
    // 3. CONSTRUCTOR
    // ===============================
    School(String name, int y) {
        this.schoolName = name;
        this.year = y;
    }


    // ===============================
    // 4. METHOD OF OUTER CLASS
    // ===============================
    void display() {
        System.out.println("School: " + schoolName);
        System.out.println("Year: " + year);
    }


    // ===============================
    // 5. INNER CLASS DEFINITION
    // ===============================
    class Student {

        // ===============================
        // 6. INNER CLASS FIELDS
        // ===============================
        String studentName;
        int grade;


        // ===============================
        // 7. INNER CLASS CONSTRUCTOR
        // ===============================
        Student(String sName, int g) {
            this.studentName = sName;
            this.grade = g;
        }


        // ===============================
        // 8. INNER CLASS METHOD
        // ===============================
        void show() {

            // Accessing outer class field directly
            System.out.println("School: " + schoolName);

            System.out.println("Student: " + studentName);
            System.out.println("Grade: " + grade);
        }
    }
}


// ===============================
// 9. MAIN CLASS TO RUN PROGRAM
// ===============================
public class _01_ClassesAndInnerClasses {

    public static void main(String[] args) {

        // ===============================
        // 10. CREATING OUTER CLASS OBJECT
        // ===============================
        School s1 = new School("Delhi Public School", 2025);

        s1.display();


        // ===============================
        // 11. CREATING INNER CLASS OBJECT
        // ===============================
        School.Student st1 = s1.new Student("Rahul", 10);

        st1.show();


        System.out.println();


        // ===============================
        // 12. SECOND OBJECT EXAMPLE
        // ===============================
        School s2 = new School("Kendriya Vidyalaya", 2024);

        School.Student st2 = s2.new Student("Priya", 12);

        st2.show();
    }
}