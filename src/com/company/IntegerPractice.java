package com.company;

import java.util.Scanner;

public class IntegerPractice {
    public static void main(StringPractice[] args) {
        System.out.println("Enter a whole number");
        Scanner congrats = new Scanner(System.in);
        int number = congrats.nextInt();
        if (number > 1 && number < 100) {
            System.out.println("Congratulations");
        }
    }
}
