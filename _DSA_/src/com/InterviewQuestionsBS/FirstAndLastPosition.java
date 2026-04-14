package com.InterviewQuestionsBS;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange2(int[] nums, int target) {
        int first = -1, last = -1;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;

            if (nums[mid] == target)
                first = mid;
        }
        left = 0;
        right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;

            if (nums[mid] == target)
                last = mid;
        }

        return new int[]{first, last};
    }


    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        //check for first occurrence if target first
        int start = search(nums, target, true);

        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;


    }

    // this function just return the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
//                potential ans is found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}



