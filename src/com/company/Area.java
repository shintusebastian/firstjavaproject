package com.company;

public class Area {
    private final static  double PI;
    static {//this represents a static block. call to the static block will be made during the class load time.
        // this is the best practice to declare static variables
        // anything between {} is called as a block.
        PI=3.14;
    }
    //declaration and initialization done separately is the good coding practice.

}
