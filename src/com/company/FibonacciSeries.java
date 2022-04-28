package com.company;

public class FibonacciSeries {
    public static void main(StringPractice[] args) {
        int n = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 0;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println(firstNumber); //0
            }
            if (i == 2) {
                System.out.println(secondNumber);//1
            }
            if (i > 2) {
                thirdNumber = firstNumber + secondNumber;
                firstNumber = secondNumber;
                secondNumber = thirdNumber;
                System.out.println(thirdNumber);
            }


        }
    }
}
