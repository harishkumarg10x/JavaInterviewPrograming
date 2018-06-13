package com.hans.problemsolving.math;

/**
 * Created by GBS03795 on 6/5/2018.
 */
public class GCDMain {


    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        int x =  gcd(b%a,a);
        System.out.println("GCD : " + x);
        return  x;
    }

    public static void main(String[] args) {
        System.out.println(gcd(100, 125));
    }
}
