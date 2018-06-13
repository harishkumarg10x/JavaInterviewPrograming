package com.hans.problemsolving.string;

/**
 * Created by GBS03795 on 11-12-2017.
 */
public class StringOccurances {
    public static void main(String[] args) {
        System.out.println("Find the substring occurances in given string");
        String str = "hhaaahgjdhbdjhhjiddkkjjhhhhhjkklmnhhqwtrythh";
        String subString = "hh";
        int lastIndex = 0;
        int count = 0;
        System.out.println("First Index : " + str.indexOf(subString));
        while(lastIndex != -1) {
            lastIndex = str.indexOf(subString, lastIndex);
            if(lastIndex != -1) {
                count++;
                lastIndex += subString.length();
            }
        }
        System.out.println("Count :: " + count);
    }
}
