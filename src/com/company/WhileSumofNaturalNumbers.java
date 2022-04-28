package com.company;

public class WhileSumofNaturalNumbers {
    public static void main(StringPractice[] args) {
        //program to find the sum of first 10 natural numbers using while loop
        int n=1, sum=0;
        while(n<=10){
            sum=sum+n;
            n++;
        }
        System.out.println(sum);
    }
}
