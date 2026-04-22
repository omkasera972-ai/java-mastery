package _03_OOP_Advance;

/*
 STRING SCP DEMO

 Covers:
 String Constant Pool
 == vs equals()
 Heap vs SCP
 String Immutability
 StringBuilder (Mutable)
 StringBuffer (Thread-safe Mutable)
*/

public class _02_String_SCP {

    public static void main(String[] args) {

        // =========================
        // STRING CONSTANT POOL (SCP)
        // =========================

        String s1 = "Java";
        String s2 = "Java";

        System.out.println("s1 == s2 : " + (s1 == s2));
        // same SCP reference


        // =========================
        // HEAP OBJECT (new keyword)
        // =========================

        String s3 = new String("Java");

        System.out.println("s1 == s3 : " + (s1 == s3));

        System.out.println("s1.equals(s3) : " + s1.equals(s3));


        // =========================
        // STRING IMMUTABILITY
        // =========================

        String name = "Om";

        name.concat(" Tamrakar");

        System.out.println("\nAfter concat(): " + name);


        // =========================
        // STRINGBUILDER (Mutable)
        // =========================

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Developer");

        System.out.println("\nStringBuilder result: " + sb);


        // =========================
        // STRINGBUFFER (Thread-safe)
        // =========================

        StringBuffer sbf = new StringBuffer("Multi");

        sbf.append(" Thread");

        System.out.println("StringBuffer result: " + sbf);


        // =========================
        // MEMORY SUMMARY OUTPUT
        // =========================

        System.out.println("\nSummary:");
        System.out.println("String -> Immutable");
        System.out.println("StringBuilder -> Mutable (Fast)");
        System.out.println("StringBuffer -> Mutable (Thread-safe)");

    }
}