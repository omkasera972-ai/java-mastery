package _02_OOP_Fundamentals;

/*
=========================================
Topic: Packages in Java
Phase: OOP Fundamentals (Phase 2)

Project Structure Example:

src
 └── _02_OOP_Fundamentals
      └── _04_Packages.java

Here:

_02_OOP_Fundamentals = package name
_04_Packages = class inside that package

So the package declaration becomes:

package _02_OOP_Fundamentals;

-----------------------------------------

What is a Package?

A package is a namespace that groups related classes
into a structured folder. It helps organize Java programs
properly in real-world projects.

Why Packages are Used?

1. Organize large projects logically
2. Avoid class name conflicts
3. Improve readability
4. Support modular programming
5. Used in enterprise-level applications

Real Example from Java Library:

java.util.Scanner

Here:

java = main package
util = subpackage
Scanner = class

IDE Support:

In IntelliJ IDEA, packages are automatically mapped
to folder structure inside the src directory.

Conclusion:

Packages are essential for writing clean,
structured, and scalable Java applications.
=========================================
*/


/*
Helper class inside SAME package
Demonstrates how multiple classes can exist
inside one package and interact with each other
*/
class PackageHelper {

    void showMessage() {

        System.out.println("Hello from PackageHelper class (same package)");
    }
}


/*
Main class demonstrating package usage
*/
public class _04_Packages {

    public static void main(String[] args) {

        System.out.println("Current Package:");
        System.out.println("_02_OOP_Fundamentals");

        System.out.println("\nCreating object from another class inside same package...");

        // Accessing another class from same package
        PackageHelper obj = new PackageHelper();

        obj.showMessage();

        System.out.println("\nPackage demonstration completed successfully.");
    }
}