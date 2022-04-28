package com.company;

import java.util.Scanner;

public class RandomNumber {
    public static void main(StringPractice[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("I have thought a number (1-100");
        int computerNumber=(int)((Math.random()*100));
        System.out.println(computerNumber);
        System.out.println("Guess my number");
        while (true){
            int userInput=sc.nextInt();
            if (userInput==computerNumber){
                System.out.println("you won, guess was right");
                break;
            }
            System.out.println("Sorry.. Guess was wrong");

        }
    }
}
