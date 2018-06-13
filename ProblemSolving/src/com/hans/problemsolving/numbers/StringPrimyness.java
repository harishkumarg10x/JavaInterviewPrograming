package com.hans.problemsolving.numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by GBS03795 on 19-03-2018.
 */
public class StringPrimyness {

    public static void main(String[] args) {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number contating (1-9) digits : ");
        String str = "123456789";
        List<Long> numbers = new ArrayList<>();
        System.out.println(str.substring(0, 1));
        StringBuilder sb = null;
        int j = 1;
        int subsequenceLength = str.length() > 6 ? 6 : str.length();
        for(int i =0 ; i < str.length() ; i++) {

            for(int k = j; k < str.length(); k++) {
                sb = new StringBuilder();
                sb.append(str.substring(i, j));
                sb.append(str.substring(k, k+1));
                System.out.println(sb.toString());
            }
            j++;
        }*/
       String str = "Harish";
        str = str.toLowerCase();
        int count[] = new int[256];
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;
        List<Integer> list = new ArrayList<>();
        for(Integer val : count) {
            list.add(val);
        }
        System.out.println(list);

    }
}
