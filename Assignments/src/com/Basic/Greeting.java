// Question: Take name as input and print a greeting message for that particular name.

package com.JavaBasic;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();

        if (name != null && !name.isEmpty()) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }

        System.out.println("Hello!, " + name + ", welcome to the city of gates.");

        in.close();
    }
}
