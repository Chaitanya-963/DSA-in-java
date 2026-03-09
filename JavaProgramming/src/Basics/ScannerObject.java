package Basics;

import java.util.Scanner;

public class ScannerObject {
    // Scanner = Scanner is an object which will help to take the inputs form the users
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your GPA: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false): ");
//        boolean isStudent = scanner.nextBoolean();
//
//        System.out.println("Hello " + name + "!");
//        System.out.println("You are " + age + " years old");
//        System.out.println("Your GPA is " + gpa);
//        System.out.println("Student " + isStudent);


        // Calculate are of a rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        System.out.print("Enter the width: ");
        width = scanner.nextDouble();

        System.out.print("Enter the height: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("The Area is: " + area + "cm²");

        scanner.close();
    }
}
