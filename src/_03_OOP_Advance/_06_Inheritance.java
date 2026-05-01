package _03_OOP_Advance;

/*
=========================================
Topic: Inheritance in Java
Author: Om Tamrakar

Inheritance = One class acquires properties of another

Parent (Super class) → Base class
Child (Sub class)   → Derived class

Keyword used: extends

Benefit:
- Code reuse
- Cleaner structure
=========================================
*/

// PARENT CLASS
class Animal {

    void eat() {
        System.out.println("Animal eats food");
    }
}

// CHILD CLASS
class Dog extends Animal {

    void bark() {
        System.out.println("Dog barks");
    }
}

// MAIN CLASS
public class _06_Inheritance {

    public static void main(String[] args) {

        Dog d1 = new Dog();

        // inherited method
        d1.eat();

        // own method
        d1.bark();
    }
}