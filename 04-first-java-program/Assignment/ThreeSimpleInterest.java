package com.kunal;

import java.util.Scanner;

public class ThreeSimpleInterest {
    static void main(String[] args) {
//        3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        float p = sc.nextFloat();
        System.out.print("Enter time: ");
        float t = sc.nextFloat();
        System.out.print("Enter rate: ");
        float r = sc.nextFloat();

        float i = (p*t*r);
        System.out.println("Simple interest is: " + i);
    }
}
