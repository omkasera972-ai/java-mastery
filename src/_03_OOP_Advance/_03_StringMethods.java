package _03_OOP_Advance;

/*
 STRING METHODS DEMO

 Covers important interview methods:

 length()
 trim()
 toUpperCase()
 substring()
 contains()
 replace()
 charAt()
 isEmpty()
 split()
 compareTo()
 intern()

 Also includes:

 StringBuilder methods
 StringBuffer methods
*/

public class _03_StringMethods {

    public static void main(String[] args) {

        // =========================
        // STRING METHODS
        // =========================

        String text = "  Java Programming  ";

        System.out.println("Original: " + text);

        System.out.println("length(): " + text.length());

        System.out.println("trim(): " + text.trim());

        System.out.println("toUpperCase(): " + text.toUpperCase());

        System.out.println("substring(0,4): " + text.substring(0,4));

        System.out.println("contains(\"Prog\"): "
                + text.contains("Prog"));

        System.out.println("replace(Java -> Python): "
                + text.replace("Java","Python"));

        System.out.println("charAt(2): "
                + text.charAt(2));

        System.out.println("isEmpty(): "
                + text.isEmpty());


        // =========================
        // split() METHOD
        // =========================

        String sentence = "Java Python C++";

        String[] words = sentence.split(" ");

        System.out.println("\nsplit() output:");

        for(String w : words)
            System.out.println(w);


        // =========================
        // compareTo() METHOD
        // =========================

        String a = "Apple";
        String b = "Banana";

        System.out.println("\ncompareTo(): "
                + a.compareTo(b));

        // negative = a < b
        // positive = a > b
        // zero = equal


        // =========================
        // intern() METHOD (SCP concept)
        // =========================

        String s1 = new String("Java");

        String s2 = s1.intern();

        String s3 = "Java";

        System.out.println("\nintern() example:");

        System.out.println(s2 == s3);


        // =========================
        // STRINGBUILDER METHODS
        // =========================

        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Developer");

        sb.insert(4," FullStack");

        sb.replace(0,4,"Python");

        sb.delete(0,6);

        sb.reverse();

        System.out.println("\nStringBuilder result: " + sb);


        // =========================
        // STRINGBUFFER METHODS
        // =========================

        StringBuffer sbf = new StringBuffer("Multi");

        sbf.append(" Thread");

        sbf.insert(5," Safe");

        sbf.replace(0,5,"Super");

        sbf.delete(0,6);

        sbf.reverse();

        System.out.println("StringBuffer result: " + sbf);


        // =========================
        // SUMMARY
        // =========================

        System.out.println("\nSummary:");

        System.out.println("String -> Immutable");

        System.out.println("StringBuilder -> Mutable + Fast");

        System.out.println("StringBuffer -> Mutable + Thread-safe");
    }
}