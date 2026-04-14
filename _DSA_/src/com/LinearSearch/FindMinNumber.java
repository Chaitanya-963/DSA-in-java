package com.LinearSearch;

public class FindMinNumber {
    public static void main() {
        int[] arr = {15, 45, 0, -2, 1, 55, 5, 161, 4, 24};
        System.out.println(findMinNumber(arr));
    }

    static int findMinNumber(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
