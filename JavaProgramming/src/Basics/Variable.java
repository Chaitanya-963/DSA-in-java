package Basics;

public class Variable {
    public static void main(String[] args) {
        // Variables : Variables are a reusable container for a value
        //             a variables behaves as if it was the value it contains

        // ☀️ Primitive = simple value stored directly in memory (Stack)
        // ⭐ Reference = memory address (stack) that points to the (heap)

        // ☀️ Primitive vs ⭐ Reference
        //    ----------      ----------
        //      int             string
        //      double          array
        //      char            object
        //      boolean


        // 2 Step to creating a  variable
        // -------------------------------
        //  1. Declaration
        //  2. Assignment

        // integer
        int age; // declaration
        age = 22; // assignment
        System.out.println("My age is: " + age);

        // double
        double marks = 95.5;
        System.out.println("My marks are " + marks);

        //Char
        char nameInitial = 'C';
        System.out.println("My name initial is " + nameInitial);

        //Boolean
        // boolean isStudent = true;
        // boolean forSale = false;
        boolean isOnline = true;
        System.out.println(isOnline);

        //String

        String name = "Chaitanya Mehetre";
        System.out.println("Follow 👉🏼 " + name);

        String channelName = "DesignedWithChaitanya";
        System.out.println("Follow 👉🏼 " + channelName);

        String email = "designedwithchaitanya@gmail.com";
        System.out.println("My email is " + email);

        String designation = "Software Developer";
        System.out.println("I am " + designation);

        System.out.println("My name is " + name +  " my age is " + age + " my channel is " + channelName + " and I am a " + designation);
    }
}
