package Basics;

import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {
        Random random = new Random();

        //INTEGER
        int number1;
        int number2;
        int number3;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 201);

        System.out.println("Number: " + number1);
        System.out.println("Number: " + number2);
        System.out.println("Number: " + number3);


        //Double

        double num = random.nextDouble(1 , 8);

        System.out.println(num);

        boolean isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("Heads");
        } else {
            System.out.println("Tails");
        }
    }
}