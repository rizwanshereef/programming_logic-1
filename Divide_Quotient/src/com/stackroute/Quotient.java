package com.stackroute;

import java.util.Scanner;

public class Quotient {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
        if(a<b)
        {
            System.out.println("The 2nd number is greater than 1st, so Quotient is 0");
        }
        else {
            int c = a / b;
            System.out.println("The quotient is:" + c);
        }
    }
}
