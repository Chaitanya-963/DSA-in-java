package com.InterviewQuestionsBS;

// Floor Question means find the greatest number in this arr that is less than or equal to the target number

public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8, 15, 16, 22, 28};
        int target = 29;
        int resultIndex = OrderAgnosticFloorNumber(arr, target);
        if (resultIndex != -1) {
            System.out.println("The Floor value is: " + arr[resultIndex] + " at index " + resultIndex + ".");
        } else {
            System.out.println("No floor found.");
        }
    }

    static int FloorNumber(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

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

        return end;
    }

    static int OrderAgnosticFloorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        if (isAsc && target < arr[start]) {
            return -1;
        }
        if (!isAsc && target < arr[end]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return isAsc ? end : start;
    }
}
