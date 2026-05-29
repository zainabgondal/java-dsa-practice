package com.kunal;

import java.util.Scanner;

public class Practice {
//Write a program to print whether a number is even or odd, also take input from the user.
//Take name as input and print a greeting message for that particular name.
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//Take 2 numbers as input and print the largest number.
//Input currency in rupees and output in USD.
//To calculate Fibonacci Series up to n numbers.
//To find out whether the given String is Palindrome or not.
//To find Armstrong Number between two given number.



    static void main(String[] args) {

        /*   To find Armstrong Number between two given number.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        int sum = 0;
        int original = num;

        while (num > 0){
            int digit = num % 10; // takes last digit
            sum = sum + (digit * digit * digit); // Armstrong (cube of a digit separately and then sum of cubes )
            num = num/10; // removes last digit
        }
        if(original == sum){
            System.out.println(original+ " is an Armstrong number!");
        } else {
            System.out.println(original+ " is not an Armstrong number!");
        }

         */


        /* To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String rev = "";

        for (int i = str.length() -1; i >= 0; i--){ // madam = 5 characters but index = 4 so str.length mean(5)-1 = 4
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println(str + " is a palindrome number");
        } else {
            System.out.println(str + " is not a palindrome number!");
        }

         */


        //To calculate Fibonacci Series up to n numbers. // 0 1 1 2 3 5 8 13...
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b; // old b value
            b=c; // new number
        }

        }
    }
