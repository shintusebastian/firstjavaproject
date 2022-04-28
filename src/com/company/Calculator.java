package com.company;

public class Calculator {
    public static void main(StringPractice[] args) {
        System.out.println((sum(4, 3)));
        System.out.println(subtraction(4,3));
        System.out.println(multiplication(4,3));
        System.out.println(division(4,3));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
     return a-b;
    }
    public static int multiplication (int a, int b){
        return a*b;
    }
    public static int division (int a, int b){
        return a/b;
    }
}

