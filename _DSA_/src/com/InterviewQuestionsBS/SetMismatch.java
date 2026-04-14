package com.InterviewQuestionsBS;

// https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            } else {
                i++;
            }
        }


        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

}
