package com.hans.problemsolving.matrices;

import java.util.Scanner;

/**
 * Created by GBS03795 on 6/11/2018.
 */
public class AltenateMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2D array length : " );
        String str = scanner.nextLine();
        System.out.println("Given Size : " + str);
        String[] array = str.split(" ");
        if(array.length == 2 && Integer.valueOf(array[0]) == Integer.valueOf(array[1])) {
            int length = Integer.valueOf(array[0]);
            int[][] matrix = new int[Integer.valueOf(array[0])][Integer.valueOf(array[1])];
            int n = 1;
            for(int i = 0; i < length; i++) {
                for(int j = 0; j < length; j++){
                    matrix[i][j] = n;
                    if(n == 1) {
                        n = 0;
                    } else {
                        n = 1;
                    }
                }
            }
            System.out.println("Printing Matrix ............... ");
            printMatrxi(matrix, length);
        } else {
            System.out.println("Please give the input in given format eg : 5 5");
        }
        scanner.close();
    }

    private static void printMatrxi(int[][] matrix, int length) {
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
