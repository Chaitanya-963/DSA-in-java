package com.CyclicSort;

/*  ⭐⭐⭐⭐⭐ Pattern
    Asked in amazon interview questions also
 -- When given numbers from range 1,N ==> Use Cyclic sort
 */

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 3, 6, 7, 1};
        cyclic(arr);
        System.out.println("Cyclic Sort Method: " + Arrays.toString(arr));
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }
}
