package com.company;

public class StringPractice {
    public static void main(String[] args) {



//        String n1="766 lindendr"; // pool area
//        String n2=new String("766 lindendr"); // heap
//        System.out.println(n1.equals(n2));



//        char [] name1={'S','e','b','a','s','t','i', 'a','n'};
//        String lastname = name1.toString();
//        System.out.println(lastname);


        String name="Shintu";
        char [] chars=name.toCharArray();
        System.out.println(chars);
        char [] reverseArr=new char[name.length()];
        int length=chars.length;
int last_index=length-1;
        for (int i=0; i<=last_index;i++){
            reverseArr[last_index-i]=chars[i];

        }
        String reverse = new String(reverseArr);
        System.out.println(reverseArr);




    }
}
