package com.Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n) {
        // Base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }

        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        System.out.print(n + " ");
        print(n + 1);
    }
}
