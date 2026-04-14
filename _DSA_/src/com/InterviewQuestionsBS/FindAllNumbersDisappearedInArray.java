package com.InterviewQuestionsBS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.CyclicSort.CyclicSort.swap;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans = MissingNumbers(arr);

        System.out.println(ans);

    }

    static List<Integer> MissingNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                result.add(index + 1);
            }
        }
        return result;
    }
}
