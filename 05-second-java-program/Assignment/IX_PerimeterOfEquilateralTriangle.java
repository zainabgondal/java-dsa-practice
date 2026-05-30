package com.rahul;

import java.util.Scanner;

public class IX_PerimeterOfEquilateralTriangle {
    static void main(String[] args) {
//        9. Perimeter Of Equilateral Triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Equilateral Triangle for perimeter: ");
        float a = sc.nextFloat();

        double perimeter = 3*a;
        System.out.println("The perimeter of Equilateral Triangle is: " + perimeter);
    }
}
