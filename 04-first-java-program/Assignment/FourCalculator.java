package com.kunal;

import java.util.Scanner;

public class FourCalculator {
    static void main(String[] args) {
//        4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Operator: ");
        String operator = sc.next();

        if (operator.equals("+")){
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1+num2));
        } else if (operator.equals("-")) {
            System.out.println("The sub of " + num1 + " and " + num2 + " is " + (num1-num2));
        } else if (operator.equals("*")) {
            System.out.println("The mul of " + num1 + " and " + num2 + " is " + (num1*num2));
        } else if (operator.equals("/")) {
            System.out.println("The div of " + num1 + " and " + num2 + " is " + (num1/num2));
        }
        else System.out.println("Error!");


    }
}
