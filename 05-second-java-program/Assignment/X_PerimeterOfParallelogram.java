package com.rahul;

import java.util.Scanner;

public class X_PerimeterOfParallelogram {
    static void main(String[] args) {
//        10. Perimeter Of Parallelogram
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        float b = sc.nextFloat();
        System.out.print("Enter side of parallelogram: ");
        float s = sc.nextFloat();

        float perimeter = 2*(b+s);
        System.out.println("The Perimeter of Parallelogram is: " + perimeter);
    }
}
