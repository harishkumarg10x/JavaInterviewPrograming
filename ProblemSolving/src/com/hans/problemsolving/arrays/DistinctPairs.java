package com.hans.problemsolving.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

/**
 * Created by GBS03795 on 6/12/2018.
 */
public class DistinctPairs {

    public static void main(String[] args) {
        int[] array = {1, 2, 10, 8, 9, 1, 3, 7, 9, 7, 3, 4, 6, 5, 5, 5, -10, 20};
        Map<Integer, Integer> map = new HashMap<>();
        StringJoiner sj = new StringJoiner("~");
        StringJoiner subJoiner = null;
        int n = 10;
        for(int i = 0 ; i < array.length; i++) {
            for(int j = 1; j < array.length; j++) {
                if(i == j) {
                    continue;
                }
                if((array[i] + array[j]) == n) {
                    if(map.get(array[j]) == null) {

                        map.put(array[i], array[j]);
                    }
                    break;
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            for(int j = 1; j < array.length; j++){
                if((array[i] + array[j]) == n) {
                    subJoiner = new StringJoiner("~");
                    String subString = subJoiner.add(String.valueOf(array[j])).add(String.valueOf(array[i])).toString();
                    System.out.println("Substring : " + subString);
                    if(sj.toString().indexOf(subString) == -1) {
                        sj.add(String.valueOf(array[i])).add(String.valueOf(array[j]));
                        count++;
                    }
                    System.out.println();
                }
            }
        }
        System.out.println("String Joiner : " + sj.toString());
        System.out.println("Count : " + count);
        System.out.println(map.size());

    }
}
