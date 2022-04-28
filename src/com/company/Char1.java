package com.company;

public class Char1 {
    public static void main(StringPractice[] args) {
        System.out.println('\u0000');
        System.out.println('\uffff');
        /*In other languages like C/C++ uses only ASCII characters and to
        represent all ASCII characters 8-bits is enough.

But java uses the Unicode system not the ASCII code system and to represent Unicode system 8 bit
is not enough to represent all characters so java uses 2 bytes for characters.
Unicode defines a fully international character set that can represent most of the world’s written languages.
It is a unification of dozens of character sets, such as Latin, Greeks, Cyrillic, Katakana, Arabic, and many more.
         */
        int []a={1,2,3,4,5};
        System.out.println(a.length);
        System.out.println(a);

    }
}
