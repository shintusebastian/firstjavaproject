package com.company;

public class NestedForLoop {
    public static void main(StringPractice[] args) {
        for (int i = 5; i >=1; i--) {
            for (int j =1 ; j <= i; j++) {
                System.out.print(i +"\t");
            }
            System.out.println();
        }
    }
}
//                            *
//                    *               *
//
//        *        *           *           *        *
