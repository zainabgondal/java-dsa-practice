package com.kunal;

import java.util.Scanner;

public class SevenFibonacciSeries {
    static void main(String[] args) {
//        7. To calculate Fibonacci Series up to n numbers.
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter term: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i<=n; i++){
            System.out.print(a + " ");
            int c = a+b;
            a=b;
            b=c;
        }

    }
}
