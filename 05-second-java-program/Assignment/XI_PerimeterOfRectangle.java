package com.rahul;

import java.util.Scanner;

public class XI_PerimeterOfRectangle {
    static void main(String[] args) {
//        11. Perimeter Of Rectangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        float l = sc.nextFloat();
        System.out.print("Enter width of rectangle: ");
        float w = sc.nextFloat();

        float perimeter = 2*(w+l);
        System.out.println("The Perimeter of rectangle is: " + perimeter);
    }
}
