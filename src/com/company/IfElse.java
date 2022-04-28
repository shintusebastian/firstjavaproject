package com.company;

public class IfElse {
    public static void main(StringPractice[] args) {
        int a = 6, b = 8, c = 10;
        if (a > b) {
            if (a > c) {
                System.out.println(a + "is larger");
            } else if (b > c) {
                System.out.println(b + "is larger");
            }
        } else System.out.println(c + "is larger");
    }
}
