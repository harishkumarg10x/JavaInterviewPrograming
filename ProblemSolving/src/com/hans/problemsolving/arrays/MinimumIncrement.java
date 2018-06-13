package com.hans.problemsolving.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by GBS03795 on 6/5/2018.
 */
public class MinimumIncrement {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{23, 45, 65, 78, 90};
        long sum = 0;
        for(int num : array) {
            sum += num;
        }
        int i = 0;
        List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
        Collections.sort(arrayList);
        long increasedSum = 0;
        int number = 0;
        for(int x : arrayList) {
            increasedSum =  x * array.length;
            if(increasedSum > sum) {
                number = x;
                break;
            }
        }
        System.out.print(number);
    }
}
