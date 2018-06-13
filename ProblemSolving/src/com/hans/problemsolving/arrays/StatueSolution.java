package com.hans.problemsolving.arrays;


import com.sun.javafx.geom.Point2D;

import java.util.Arrays;

/**
 * Created by GBS03795 on 6/7/2018.
 */
public class StatueSolution {

    public static int solution(Point2D[] A) {

        return 0;
    }

    public  static boolean isLinear(Point2D[] a) {
        double y1 = a[1].y - a[0].y;
        double x1 = a[1].x - a[0].x;
        double y2 = a[2].y - a[0].y;
        double x2 = a[2].x - a[0].x;
        if(y1/x1 == y2/x2) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(0, 0);
        Point2D p2 = new Point2D(1, 2);
        Point2D p3 = new Point2D(3, 5);
        Point2D[] array = {p1, p2, p3};
        System.out.println(isLinear(array));
    }
}
