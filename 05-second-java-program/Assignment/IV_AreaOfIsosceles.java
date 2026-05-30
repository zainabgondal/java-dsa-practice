package com.rahul;

import java.util.Scanner;

public class IV_AreaOfIsosceles {
    static void main(String[] args) {
//         4. Area Of Isosceles Triangle
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of isosceles triangle: ");
        float a = sc.nextFloat();

        System.out.print("Enter base of isosceles triangle: ");
        float b = sc.nextFloat();

        double area = (b/4.0)*Math.sqrt((4*a*a)- (b*b));
        System.out.println("The Area of isosceles triangle is: " + area);
    }
}
