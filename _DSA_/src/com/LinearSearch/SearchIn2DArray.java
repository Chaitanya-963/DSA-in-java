package com.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {4, 6, 2, 5},
                {6, 4, 2, 5, 1},
                {9, 1, 2,5, 3, 4},
                {4, 6, 22, 4,555,5}
        };

        int target = 5;
        int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));

        List<int[]> results = searchAll(arr, target);

        for (int[] coordinate : results) {
            System.out.println(Arrays.toString(coordinate));
        }

        System.out.println(max(arr));
    }

    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }

    static List<int[]> searchAll(int[][] arr, int target) {
        List<int[]> foundIndices = new ArrayList<>();
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    foundIndices.add(new int[]{row, col});
                }
            }
        }
        return foundIndices;
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
