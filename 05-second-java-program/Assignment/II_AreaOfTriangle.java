package com.rahul;

import java.util.Scanner;

public class II_AreaOfTriangle {
    static void main(String[] args) {
//        2. Area Of Triangle

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height of Triangle: ");
        float h = sc.nextFloat();

        System.out.print("Enter base of Triangle: ");
        float b = sc.nextFloat();

        double area = 1/2.0*b*h;
        System.out.println("The area of triangle is: " + area);
    }
}
