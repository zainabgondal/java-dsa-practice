package com.rahul;

import java.util.Scanner;

public class XIII_PerimeterOfRhombus {
    static void main(String[] args) {
//        13. Perimeter Of Rhombus
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Rhombus for perimeter: ");
        float a = sc.nextFloat();

        double perimeter = 4*a;
        System.out.println("The perimeter of Rhombus is: " + perimeter);
    }
}
