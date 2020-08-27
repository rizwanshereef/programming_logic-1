package com.stackroute;

import java.util.Scanner;

<<<<<<< HEAD:Area_square_rectangle/src/com/stackroute/Area_square_rectangle.java
public class Area_square_rectangle {
    /* main class to input lenght and breadth and calculate area of Square and Rectangle separately.*/
=======
public class Main {
/* main class to input lenght and breadth and calculate area of Square and Rectangle separately.*/
>>>>>>> 07b4a1ffcac19fc4394b91192a9576b3b3a0a3c6:Area_square_rectangle/src/com/stackroute/Main.java
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the Rectangle/Square:");
        int a = s.nextInt();
        System.out.println("Enter the breadth of the Rectangle/Square:");
        int b = s.nextInt();
<<<<<<< HEAD:Area_square_rectangle/src/com/stackroute/Area_square_rectangle.java
        /* Check if it is Square or Rectangle */
=======
/* Check if it is Sqaure or Rectangle */
>>>>>>> 07b4a1ffcac19fc4394b91192a9576b3b3a0a3c6:Area_square_rectangle/src/com/stackroute/Main.java
        if(a==b){
            System.out.println("The area of the Square is: "+(a*a));
        }
        else{
            System.out.println("The area of the Rectangle is: "+(a*b));
        }
    }
}
