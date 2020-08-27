package com.stackroute;

import java.util.Scanner;
/* Program to find the highest number*/

public class Largest_2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Input the numbers */

        System.out.println("Enter the 1st number:");
        int numOne = scan.nextInt();
        System.out.println("Enter the 2nd number:");
        int numTwo = scan.nextInt();

/* Check the largest by comparing and display result*/
        if(numOne>numTwo){
            System.out.println("The Highest number is:"+numOne);

        }
        else{
            System.out.println("The Highest number is:"+numTwo);
        }
    }
}
