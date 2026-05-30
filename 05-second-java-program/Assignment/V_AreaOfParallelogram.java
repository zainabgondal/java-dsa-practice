package com.rahul;

import java.util.Scanner;

public class V_AreaOfParallelogram {
    static void main(String[] args) {
//        5. Area Of Parallelogram

        Scanner in = new Scanner(System.in);
        System.out.print("Enter width of parallelogram: ");
        float w = in.nextFloat();
        System.out.print("Enter length of parallelogram: ");
        float l = in.nextFloat();

        double area = l*w;
        System.out.println("The area of parallelogram is: " + area);
    }
}
