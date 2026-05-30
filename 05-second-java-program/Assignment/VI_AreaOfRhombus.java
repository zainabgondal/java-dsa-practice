package com.rahul;

import java.util.Scanner;

public class VI_AreaOfRhombus {
    static void main(String[] args) {
//        6. Area Of Rhombus

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of 1st diagonal of Rhombus: ");
        float d1 = sc.nextFloat();

        System.out.print("Enter the length of 2nd diagonal of Rhombus: ");
        float d2 = sc.nextFloat();

        double area = (d1*d2)/2.0;
        System.out.println("The area of Rhombus is: " + area);

    }
}
