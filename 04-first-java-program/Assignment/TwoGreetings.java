package com.kunal;

import java.util.Scanner;

public class TwoGreetings {
    static void main(String[] args) {
//       2.  Take name as input and print a greeting message for that particular name.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name);
    }
}
