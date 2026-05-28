package com.kunal;

import java.util.Scanner;

public class EightPalindrome {
    static void main(String[] args) {
//        8. To find out whether the given String is Palindrome or not.
        // A word that is same from front and back
        // ex: madam
        //level
        //radar
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String stri = sc.nextLine();
        String rev = "";

        for (int i= stri.length() -1; i >= 0; i--){
            rev = rev + stri.charAt(i);
        }

        if (rev.equals(stri)){
            System.out.println(stri + " is palindrome!");
        }
        else {
            System.out.println(stri + " is not palindrome!");
        }
    }
}
