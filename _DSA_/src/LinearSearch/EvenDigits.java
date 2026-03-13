package LinearSearch;// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    static void main(String[] args) {
        int[] nums = {12, 5114, 3, 6, 1212, 524, 22};
        System.out.println(digits2(-253548));
    }

    static int findNumber(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check number contains even number of digit or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
//        if (numberOfDigits % 2 == 0) return true;
//        return false;
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num) {
        if (num < 0) {
            num = num * -1;
        }
        return (int) (Math.log10(num)) + 1;
    }

    // count number of digits in a number
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }
}
