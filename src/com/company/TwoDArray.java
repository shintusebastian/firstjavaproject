package com.company;

public class TwoDArray {
    public static void main(StringPractice[] args) {
        int arr[][] = new int[][]{{1, 2, 3, 4}, {2, 3, 4, 5,}, {3, 4, 5, 6}};
        //  int arr[][]=new int[3][4]; if we print this array, it will show all 0.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
        System.out.println(arr.length);// gives the no of rows in the array
        System.out.println(arr[0].length);//gives the number of columns in the array

    }
}
