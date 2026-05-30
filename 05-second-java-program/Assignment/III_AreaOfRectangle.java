package com.rahul;

import java.util.Scanner;

public class III_AreaOfRectangle {
    static void main(String[] args) {
//        Area Of Rectangle Program

        Scanner in = new Scanner(System.in);
        System.out.print("Enter width of rectangle: ");
        float w = in.nextFloat();
        System.out.print("Enter length of rectangle: ");
        float l = in.nextFloat();

        double area = l*w;
        System.out.println("The area of rectangle is: " + area);
    }
}
