package com.stackroute;

import java.util.Scanner;

public class Main {
/* main class to input lenght and breadth and calculate area of Square and Rectangle separately.*/
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle/Square:");
        int a = s.nextInt();
        System.out.println("Enter the breadth of the Rectangle/Square:");
        int b = s.nextInt();
/* Check if it is Sqaure or Rectangle */
        if(a==b){
            System.out.println("The area of the Square is: "+(a*a));
        }
        else{
            System.out.println("The area of the Rectangle is: "+(a*b));
        }
    }
}
