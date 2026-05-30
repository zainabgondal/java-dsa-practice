package com.rahul;

import java.util.Scanner;

public class XII_PerimeterOfSquare {
    static void main(String[] args) {
//        12. Perimeter Of Square
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square for perimeter: ");
        float a = sc.nextFloat();

        double perimeter = 4*a;
        System.out.println("The perimeter of square is: " + perimeter);
    }
}
