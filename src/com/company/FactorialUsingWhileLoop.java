package com.company;

public class FactorialUsingWhileLoop {
    public static void main(StringPractice[] args) {
        //program to find the factorial of 10
        int n = 1, product = 1;
        while (n <= 10) {
            product = product * n;
            n++;
        }
        System.out.println(product);
    }
}
