package com.hans.problemsolving.tricky;

/**
 * Created by GBS03795 on 6/1/2018.
 */
public class FibanocciSeries {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(f(n));
    }

    private static int f(int n) {
        if(n == 0) {
           return 0;
        } if(n == 1) {
            return 1;
        } else {
            return f(n-1) + f(n-2);
        }
    }
}
