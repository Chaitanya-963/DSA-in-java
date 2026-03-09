package ConditionalsAndLoops;

public class IfClass {
    public static void main(String[] args) {

        int age = 12;

        if (age >= 18) {
            System.out.println("You are an adult!");
        } else if (age < 0) {
            System.out.println("You haven't born yet!");
        } else if (age == 0) {
            System.out.println("You are a baby!");
        } else {
            System.out.println("You are a child");
        }
    }
}
