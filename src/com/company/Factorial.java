package com.company;

public class Factorial {
    public static void main(StringPractice[] args) {
       //program to find the factorial of number=10
        int number=10;
        long factorial=1;
        for(int i=number;i>=1;i--){
            factorial=i*factorial;
        }
        System.out.println(factorial);



    }
}
