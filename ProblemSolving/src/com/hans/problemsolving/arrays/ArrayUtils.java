package com.hans.problemsolving.arrays;

import java.util.HashMap;

/**
 * Created by GBS03795 on 6/11/2018.
 */
public class ArrayUtils {

    public static int[] removeDuplicates(int[] array) {
        Integer[] uniqueArray = new Integer[array.length];
        int j = 0;
        for(int i = 0; i < array.length; i++) {
            if(!contains(uniqueArray, array[i], j)) {
                uniqueArray[j++] = array[i];
            }
        }
        int[] finalArray = new int[j];
        for(int i = 0; i < j; i++) {
            finalArray[i] = uniqueArray[i];
        }
        return finalArray;
    }

    private static boolean contains(Integer[] uniqueArray, int elment, int index) {
        for(int i = 0; i <= index; i++) {
            if(uniqueArray[i] != null && uniqueArray[i] == elment) {
                return true;
            }
        }
        return false;

    }
}
