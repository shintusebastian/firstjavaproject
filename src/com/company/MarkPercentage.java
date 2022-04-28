package com.company;

import java.util.Scanner;

public class MarkPercentage {
    public static void main(StringPractice[] args) {
        System.out.println("Enter mark of First subject");
        Scanner m1 = new Scanner(System.in);
        int subject1 = m1.nextInt();
        System.out.println("Enter mark of Second subject");
        int subject2 = m1.nextInt();
        System.out.println("Enter mark of third subject");
        int subject3 = m1.nextInt();
        System.out.println("Enter mark of fourth subject");
        int subject4 = m1.nextInt();
        System.out.println("Enter mark of Fifth subject");
        int subject5 = m1.nextInt();
        int totalMark = 250;
        float markObtained = subject1 + subject2 + subject3 + subject4 + subject5;
        float percentage = ((markObtained * 100) / totalMark);
        if (percentage >= 80) {
            System.out.println("A Grade");
        } else if (percentage >= 70 && percentage < 80) {
            System.out.println("B Grade");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("C Grade");
        } else {
            System.out.println("D Grade");
        }

    }
}
