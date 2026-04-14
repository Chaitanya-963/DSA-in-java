package com.Recursion;

//fibo(N) = fibo(N-1) + fibo(N-2);

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fibo(6));

    }

    static int fibo(int N) {
        if (N == 0 || N == 1) {
            return N;
        }

        return fibo(N - 1) + fibo(N - 2);
    }
}
