package com.kunal;

import java.util.Scanner;

import static java.lang.Math.max;

public class FiveLargestNumber {
    static void main(String[] args) {
//        5. Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        int maxi = max(num1, num2);
        System.out.println("The largest number is : " + maxi);
        
    }
}
