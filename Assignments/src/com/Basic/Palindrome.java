// Question: To find out whether the given String is Palindrome or not.

package com.JavaBasic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string you want to check palindrome: ");
        String str = in.nextLine();

        boolean isPalindrone = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrone = false;
                break;
            }
        }

        if (isPalindrone) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

    }
}
