package com.company;

import java.util.Scanner;

public class Integer1 {
    public static void main(StringPractice[] args) {
        System.out.println("Please enter a month number 1-12");
        Scanner number = new Scanner(System.in);
        int month = number.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("The month has 31 days");
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("The month has 30 days");

        }
        if (month == 2) {
            System.out.println("The month has 28 days");
        }
    }
}
