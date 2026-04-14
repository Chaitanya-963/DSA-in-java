package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {111, 100, 54, 41, 23, 12, 10, 5, 3, 1};
        int[] arr2 = {2, 5, 6, 78, 82, 84, 89, 92, 105, 150, 202};
        int target = 105;


        int result = orderAgnosticBS(arr2, target);
        System.out.println("Index of " + target + " is: " + result);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //find weather the array is sorted in ace or desc order.
        boolean isAsc = arr[start] < arr[end];

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
        return -1;
    }
}
