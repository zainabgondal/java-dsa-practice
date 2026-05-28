package com.kunal;

import java.util.Scanner;

public class OneEvenOdd {
    public static void main(String[] args) {
//        1. Write a program to print whether a number is even or odd, also take input from the user.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num % 2 == 0){
            System.out.println(num + " is Even Number!");
        }

        else System.out.println(num + " is Odd Number!");
    }
}
