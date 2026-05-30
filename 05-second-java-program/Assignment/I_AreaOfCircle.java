package com.rahul;

import java.util.Scanner;

public class I_AreaOfCircle {
    static void main(String[] args) {
//        1. Area Of Circle Java Program

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius= sc.nextFloat();

       double area = Math.PI*(radius*radius);
        System.out.printf("The Area of circle is: " + area);
    }
}
