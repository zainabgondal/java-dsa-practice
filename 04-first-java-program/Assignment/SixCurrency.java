package com.kunal;

import java.util.Scanner;

public class SixCurrency {
    static void main(String[] args) {
//        6. Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency in rupees: ");
        float rupee = sc.nextFloat();
        float u = rupee/278.916f;
        System.out.println(rupee + " in USD is: " + u);


    }
}
