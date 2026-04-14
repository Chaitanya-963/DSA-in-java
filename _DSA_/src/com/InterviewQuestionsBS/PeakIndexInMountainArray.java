package com.InterviewQuestionsBS;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 elem > mid elem
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 check above
        // start and end are always trying to find max element in the above 2 check hence, when they are pointing to just one element, that is the max one because that is what the check says.
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of the above line that is the best possible answer
        return start;
    }
}
