package Basics;

import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println(Math.PI);

//        double result;
//        result = Math.pow(4, 5);
//        result = Math.abs(-48);
//        result = Math.sqrt(25);
//        result = Math.round(25.5114);
//        result = Math.ceil(25.5114);
//        result = Math.floor(25.5114);
//        result = Math.max(25, 45);
//        result = Math.min(25, 45);
//        System.out.println(result);


        //Hypotenuse


//        double a;
//        double b;
//        double c;
//
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b = scanner.nextDouble();
//
//        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
//
//        System.out.println("The Hypotenuse is " + c + "cm");


        // Circumference = 2 * Math.PI * radius;
        //area = Math.PI * Math.pow(radius,2)
        //Volume = (4.0/2.0) * Math.PI * Math.pow(radius,3)

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter your radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


        System.out.printf("The circumference is: %.1fcm ", circumference);
        System.out.printf("\nThe area is %.1fcm²", area);
        System.out.printf("\nThe area is %.1fcm³", volume);


        scanner.close();
    }
}
