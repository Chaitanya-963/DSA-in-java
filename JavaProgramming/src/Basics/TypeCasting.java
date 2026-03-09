package Basics;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        int rollno = input.nextInt();
//        System.out.println(rollno);

        // Type Casting
//        int num = (int)(51.45);
//        System.out.println(num);

        // automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) a; // 257 % 256 = 1


        byte a = 40;
        byte b = 50;
        byte c = 100;
        int d = a * b / c;

        System.out.println(d);

    }

}
