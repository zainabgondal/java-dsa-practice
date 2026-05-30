package com.rahul;

import java.util.Scanner;

public class VII_AreaOfEquilateral {
    static void main(String[] args) {

//        7. Area Of Equilateral Triangle
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Equilateral Triangle: ");
        float s = sc.nextFloat();

        double area = Math.sqrt(3)/4.0*s*s;
        System.out.println("The area of Equilateral Triangle is: " + area);
    }
}
