package com.kunal;

import java.util.Scanner;

public class TypeCasting {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num = input.nextInt();
//        System.out.println(num);

        // type casting
//        int num = (int)(785.87f);
//        System.out.println(num);

//        automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // total 256 but its 257 so it will do 257 % 256 = 1
//
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d); all are byte so they can be convert automatically in integer.

//        byte b = 20;
//        b = b*2; // this is integer we cant do it byte bec int is large and byte is small so we can do large
                   // to small (implicit) but not small to large

        int number = 'A';
        System.out.println(number); // 65 will print

        System.out.println("ہیلو");
        System.out.println("你好");

        System.out.println(3 * 9.8765); // ans will be in float

        int i = 8932;
        byte b = 54;
        char c ='a';
        short s = 8764;
        long l = 8778743636536536L;
        float f = 67.87f;
        double d = 98733.765533;

        double result = (f * b) + (i / c) - (d * s);
//         float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);





    }
}
