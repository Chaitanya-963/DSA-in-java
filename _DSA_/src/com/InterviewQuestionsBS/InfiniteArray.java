package com.InterviewQuestionsBS;

// Question : Assume you have the infinite number of array arr, and you have to find a target num in it, and you don't use the arr.length, and you don't now the size of array start and end position, what approach is best fit for this problem

public class InfiniteArray {
    public static void main(String[] args) {
        // assume the array as infinite array
        int[] arr = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 21, 25, 31, 41, 45, 54, 65, 88, 212, 511};
        int target = 15;
        System.out.println(findRange(arr, target));
    }

    static int findRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            int newStart = end + 1;
            // end - (start - 1) = (end - start + 1) // simple math expression
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
