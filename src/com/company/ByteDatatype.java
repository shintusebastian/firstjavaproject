package com.company;

public class ByteDatatype {
    public static void main(StringPractice[] args) {
        byte a = 126;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        // It overflows here because
        // byte can hold values from -128 to 127
        System.out.println(a);//will display -128, because it loops back within the range
        a++;
        System.out.println(a);
        /*Both float and double data types were designed especially for scientific calculations, where approximation errors are
        acceptable.
        If accuracy is the most prior concern then, it is recommended not to use these data types and use BigDecimal class instead.
        Please see this for details: Rounding off errors in Java
         */
    }
}
