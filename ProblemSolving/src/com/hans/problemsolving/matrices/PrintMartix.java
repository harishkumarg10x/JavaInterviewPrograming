package com.hans.problemsolving.matrices;

import java.util.Arrays;

/**
 * Created by GBS03795 on 21-12-2017.
 */
public class PrintMartix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        //System.out.print(Arrays.deepToString(matrix));
        for(int i = 0; i < matrix.length; i++) {
            int[] a = matrix[i];
            if(i%2 == 0) {
                for(int j = 0; j < a.length; j++) {
                    System.out.print(a[j] + " ");
                }
            } else {
                for(int j = a.length-1; j >= 0; j--) {
                    System.out.print(a[j] + " ");
                }
            }



            System.out.println();
        }
        String [] newArray = new String[0];
        System.out.println("Array Operations");
        for(String str : newArray) {
            System.out.println(str);
        }
    }
}
