package com.hans.problemsolving.inheritance;

/**
 * Created by GBS03795 on 6/12/2018.
 */
public class ClassB extends ClassA {
    static {
        System.out.print("B ");
    }

    public ClassB() {
        System.out.print("B1 ");
    }
}
