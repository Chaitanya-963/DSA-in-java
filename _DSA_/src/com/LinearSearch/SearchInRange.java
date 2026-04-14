package com.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 21, 5, 12, 3, 54, 22};
        int target = 3;
        System.out.println(searchInRange(arr,target,1,4));
    }

    static int searchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;

        for (int i = start; i <= end; i++) {
            int elem = arr[i];
            if (elem == target) {
                return i;
            }
        }

        return -1;
    }
}
