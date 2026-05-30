package com.rahul;

import java.util.Scanner;

public class VIII_PerimeterOfCircle {
    static void main(String[] args) {
//        8. Perimeter Of Circle
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle for perimeter: ");
        float r = in.nextFloat();

        double perimeter = 2*Math.PI*r;
        System.out.println("The perimeter of circle is: " + perimeter);

    }
}
