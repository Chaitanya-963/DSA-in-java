package ConditionalsAndLoops;

import java.util.Scanner;

public class LoopClass {
    public static void main(String[] args) {
        // while loop = repeat some code forever while some condition remains true
        Scanner scanner = new Scanner(System.in);

//        String response = "";
//
//        while (!response.equals("Q")) {
//            System.out.println("You are playing a game");
//            System.out.print("Press Q to quit: ");
//            response = scanner.next().toUpperCase();
//        }
//
//        System.out.println("You have quit the game" + response);

//        int age = 0;
//
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();
//
//        while (age < 0) {
//            System.out.println("your age can't be negative");
//            System.out.print("Enter your age: ");
//            age = scanner.nextInt();
//        }
//
//
//        System.out.println("You are " + age + " years old");


        int age = 0;

        do {
            System.out.println("your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);


        System.out.println("You are " + age + " years old");


        scanner.close();
    }
}
