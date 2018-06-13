package com.hans.problemsolving.arrays;

/**
 * Created by GBS03795 on 6/11/2018.
 */
public class _2DArray {
    public static void main(String[] args) {
        int a[][] = new int[5][5];
        int n = 0;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                if (n%2==0)
                    a[i][j]=1;
                n++;
            }
        }

        for(int i=0; i<a.length; i++) {
            for(int j=0; j<a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
