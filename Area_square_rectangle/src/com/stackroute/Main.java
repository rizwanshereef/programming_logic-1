package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle/Square:");
        int a = s.nextInt();
        System.out.println("Enter the breadth of the Rectangle/Square:");
        int b = s.nextInt();

        if(a==b)
        {
            System.out.println("The area of the Square is: "+(a*a));
        }
        else
        {
            System.out.println("The area of the Rectangle is: "+(a*b));
        }
    }
}
