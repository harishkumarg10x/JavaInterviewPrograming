package com.hans.problemsolving.string;

/**
 * Created by GBS03795 on 21-03-2018.
 */
public class StringMethods {

    public static void main(String[] args) {
        String string = "My Java String";
        System.out.println(string.codePointAt(3));
        System.out.println(string.codePointAt(0));
        long count = string.chars().filter(ch -> ch == 'a').count();
        System.out.println("Count of given character :: " + count);
    }

    private static void count() {
    }
}
