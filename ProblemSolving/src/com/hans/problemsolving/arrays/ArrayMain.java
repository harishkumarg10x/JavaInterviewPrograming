package com.hans.problemsolving.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GBS03795 on 6/1/2018.
 */
public class ArrayMain {

    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 4, 1, 2, 9, 8, 10};
        int n = nums.length + 1;
        System.out.println("Number length : " + n);
        long sum = (n*(n+1))/2;
        long realSum = 0;
        for(int i : nums) {
            realSum += i;
        }
        long missingNumber = sum - realSum;
        System.out.println("Missing Number : " + missingNumber);
        //List<String> list = new ArrayList<>();
        int[] array = {10, 100, 1000, 10, 100, 1000};
        int[] uniqueArray = ArrayUtils.removeDuplicates(array);
        for(int x : uniqueArray) {
            System.out.print(x + " ");
        }
    }
}
