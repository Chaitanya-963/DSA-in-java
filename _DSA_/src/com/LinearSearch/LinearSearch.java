package com.LinearSearch;

public class LinearSearch {
    static void main() {
        int[] num = {12, 54, 6, 4, 3, 84, 21, 336, 14, 12, 85, 35};
        int target = 336;
        boolean ans = linearSearch3(num, target);
        System.out.println(ans);
    }


    //search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {

        for (int elem : arr) {
            //check for element at every index if it is == target
            if (elem == target) {
                return true;
            }
        }
        // this line is execute if none of the return statement above have executed hence the target not found
        return false;
    }

    // Search the target and return the element
    static int linearSearch2(int[] arr, int target) {

        for (int elem : arr) {
            //check for element at every index if it is == target
            if (elem == target) {
                return elem;
            }
        }
        // this line is execute if none of the return statement above have executed hence the target not found
        return Integer.MAX_VALUE;
    }

    // search the target and return the target index
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is == target
            int elem = arr[i];
            if (elem == target) {
                return i;
            }
        }
        // this line is execute if none of the return statement above have executed hence the target not found
        return -1;
    }
}
