package com.InterviewQuestionsBS;

// Ceiling Question means find the smallest number in this arr that is greater than or equal to the target number

public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 17, 18};
        int target = 15;
        int resultIndex = OrderAgnosticCeilingNumber(arr, target);
        if (resultIndex != -1) {
            System.out.println("The ceiling value is: " + arr[resultIndex]);
        } else {
            System.out.println("No ceiling found.");
        }
    }

    static int CeilingNumber(int[] arr, int target) {

        if (target > arr[arr.length - 1]) {
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


        return start;
    }

    static int OrderAgnosticCeilingNumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        if (isAsc && target > arr[end]) return -1;
        if (!isAsc && target > arr[start]) return -1;

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
        return isAsc ? start : end;
    }
}
