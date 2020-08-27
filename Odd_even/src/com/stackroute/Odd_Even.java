package com.stackroute;

import java.util.Scanner;
/* Program to check if the entered value is even or Odd*/

public class Odd_Even {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Input the number*/
        System.out.println("Enter the number:");
        int numOne = scan.nextInt();
        /* Check if the number is odd or even and print the result*/

        if(numOne%2==0){
            System.out.println("The entered value is Even");
        }
        else{
            System.out.println("The entered value is Odd");
        }
    }
}
