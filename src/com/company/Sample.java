package com.company;


public class Sample {
    public static void main(String[] args) {



        String s = "Shintu " + "Sebastian" + 1994;
        System.out.println(s);
        System.out.println(printFullName("Shintu", "Sebastian"));
    }

    public static String printFullName(String firstName, String lastName) {
        return firstName + lastName;
    }

}
