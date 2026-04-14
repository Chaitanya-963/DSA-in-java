package com.LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxSum = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int rowSum = 0;
            for (int account : person) {
                rowSum += account;
            }
            if (rowSum > maxSum) {
                maxSum = rowSum;
            }
        }
        return maxSum;
    }
}
