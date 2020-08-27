package com.stackroute;

import java.util.Scanner;

public class Area_square_rectangle {

/* main class to input length and breadth and calculate area of Square and Rectangle separately.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle/Square:");
        int numOne = scan.nextInt();
        System.out.println("Enter the breadth of the Rectangle/Square:");
        int numTwo = scan.nextInt();

/* Check if it is Square or Rectangle */

        if(numOne==numTwo){
            System.out.println("The area of the Square is: "+(numOne*numOne));
        }
        else{
            System.out.println("The area of the Rectangle is: "+(numOne*numTwo));
        }
    }
}
