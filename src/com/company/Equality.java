package com.company;

import java.util.Scanner;

public class Equality {
    public static void main(StringPractice[] args) {
        System.out.println("Enter the first number");
        Scanner input1 = new Scanner(System.in);
        int number1 = input1.nextInt();
        System.out.println("Enter the second number");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("Enter the third number");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();
        if (number1 == number2 && number2 == number3) {
            System.out.println("All three numbers are equal");
        }
    }
}
