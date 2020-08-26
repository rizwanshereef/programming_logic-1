package com.stackroute;

import java.util.Scanner;
/* Program to input 2 numbers, divide the first number by second number and display their quotient.*/
public class Quotient {

    public static void main(String[] args) {
        /* Input Variables */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
        /* Check if the 2nd number is greater than 1 so division not possible */
        if(a<b){
            System.out.println("The 2nd number is greater than 1st, so Quotient is 0");
        }
        else {
            int c = a / b;
            System.out.println("The quotient is:" + c);
        }
    }
}
