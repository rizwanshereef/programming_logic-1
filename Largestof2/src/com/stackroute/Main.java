package com.stackroute;

import java.util.Scanner;
/* Program to find the highest number*/
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*Input the numbers */
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
/* Check the largest by comparing and display result*/
        if(a>b){
            System.out.println("The Highest number is:"+a);

        }
        else{
            System.out.println("The Highest number is:"+b);
        }
    }
}
