package com.InterviewQuestionsBS;

import java.util.Arrays;

public class TCSNQT_FindMaxSubArray {


    public static void findMaxSubarray(int[] nums) {
        if (nums == null || nums.length == 0) return;

        // Initialize variables
        int maxSum = nums[0];
        int currSum = nums[0];
        int start = 0;      // Current subarray start
        int ansStart = 0;   // Result subarray start
        int ansEnd = 0;     // Result subarray end

        for (int i = 1; i < nums.length; i++) {
            // Choice: Extend existing subarray or start a new one from current element
            if (nums[i] > currSum + nums[i]) {
                currSum = nums[i];
                start = i; // Reset start index to current position
            } else {
                currSum += nums[i];
            }

            // Update global maximum and its boundaries
            if (currSum > maxSum) {
                maxSum = currSum;
                ansStart = start;
                ansEnd = i;
            }
        }

        // Print the results
        System.out.println("Maximum Sum: " + maxSum);
        int[] subarray = Arrays.copyOfRange(nums, ansStart, ansEnd + 1);
        System.out.println("Subarray: " + Arrays.toString(subarray));
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        findMaxSubarray(arr);
    }

}
