package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {111,100,54,41,23,12,10,5,3,1};
        int target = 111;
//        Arrays.sort(arr);

        // 2. Print the array properly using Arrays.toString()
//        System.out.println("Sorted Array: " + Arrays.toString(arr));

        // 3. Search the now-sorted array
        int result = binarySearchDesc(arr, target);
        System.out.println("Index of " + target + " is: " + result);
    }

    //return the index using binary search and arr in sorted in ascending order
    static int binarySearchAsc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start+end) / 2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }

    //return the index using binary search and arr in sorted in Descending order
    static int binarySearchDesc(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start+end) / 2; //might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                start = mid + 1;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else {
                // answer found
                return mid;
            }
        }
        return -1;
    }
}
