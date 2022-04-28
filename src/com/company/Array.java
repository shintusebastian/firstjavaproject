package com.company;

public class Array {
    public static void main(StringPractice[] args) {
        int marks[]=new int[5];
        // filling array
//      int marks1[]=new int[]{10,20,30,40,50}; another way of array initialization
        //int marks2[]={12,23,45,56,76}; another way of array initialization
        for (int i=0;i<5;i++){
            marks[i]=10;
        }

int s=0;
        for (int i=0;i<5;i++){
            s=s+marks[i];
        }
        System.out.println(s);
    //after array object is used, put array_object=null;

        char name[]={'s','h','i','n','t','u'};
        System.out.println(name[0]);
    }
}
