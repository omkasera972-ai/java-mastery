package _02_OOP_Fundamentals;

/*
=========================================
Topic: Access Modifiers in Java
Phase: OOP Fundamentals (Phase 2)

Summary:
This program demonstrates different types of access modifiers
in Java: private, default, protected, and public.

Description:
Access modifiers control the visibility of variables and methods
inside a class and across packages.

Types covered:
1. private   → accessible only inside same class
2. default   → accessible inside same package
3. protected → accessible inside package + subclass
4. public    → accessible everywhere
=========================================
*/

class AccessExample {

    /*
    Private Access Modifier
    Accessible only inside same class
    */
    private String privateMsg = "Private Access Modifier";


    /*
    Default Access Modifier
    Accessible only inside same package
    */
    String defaultMsg = "Default Access Modifier";


    /*
    Protected Access Modifier
    Accessible inside package + subclass
    */
    protected String protectedMsg = "Protected Access Modifier";


    /*
    Public Access Modifier
    Accessible everywhere
    */
    public String publicMsg = "Public Access Modifier";


    /*
    Method to display all access modifier values
    */
    void showMessages() {

        System.out.println(privateMsg);
        System.out.println(defaultMsg);
        System.out.println(protectedMsg);
        System.out.println(publicMsg);
    }
}


/*
Main class to execute program
*/
public class _03_AccessModifiers {

    public static void main(String[] args) {

        AccessExample obj = new AccessExample();

        obj.showMessages();
    }
}