package com.InterviewQuestionsBS;

/*
⭐⭐⭐⭐ Tips:

If Range ==> [0,N], every element will be at index = value

if range ==>[1,N], every element will be at index = value -1;

 */


import java.util.Arrays;

import static com.CyclicSort.CyclicSort.swap;

public class MissingNumber_Cyclic {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int ans = missingNumber(arr);
        System.out.println("Missing Number is " + ans);
    }

    static public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = 0;
        int expectedSum = n * (n + 1) / 2;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    static int missingNum(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correctIndex = arr[i];

            if (arr[i] < n && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j) {
                return j;
            }
        }

        return n;
    }
}
