package _03_OOP_Advance;

/*
=========================================
Topic: Encapsulation in Java
Author: Om Tamrakar

Encapsulation = Data hiding + controlled access

Rules:
1. Make variables private
2. Use public getter & setter methods

Benefit:
- Security
- Data control
- Clean code
=========================================
*/

// CLASS 1: Student (Encapsulation)
class Student {

    // PRIVATE DATA (hidden)
    private String name;
    private int age;

    // SETTER (set value)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // GETTER (get value)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


// CLASS 2: Main Class
public class _05_Encapsulation {

    public static void main(String[] args) {

        Student s1 = new Student();

        // setting values
        s1.setName("Om");
        s1.setAge(20);

        // getting values
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}