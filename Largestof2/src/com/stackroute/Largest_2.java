package com.stackroute;

import java.util.Scanner;
/* Program to find the highest number*/
<<<<<<< HEAD:Largestof2/src/com/stackroute/Largest_2.java
public class Largest_2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*Input the numbers */
=======
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*Input the numbers */
>>>>>>> 07b4a1ffcac19fc4394b91192a9576b3b3a0a3c6:Largestof2/src/com/stackroute/Main.java
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
<<<<<<< HEAD:Largestof2/src/com/stackroute/Largest_2.java
        /* Check the largest by comparing and display result*/
=======
/* Check the largest by comparing and display result*/
>>>>>>> 07b4a1ffcac19fc4394b91192a9576b3b3a0a3c6:Largestof2/src/com/stackroute/Main.java
        if(a>b){
            System.out.println("The Highest number is:"+a);

        }
        else{
            System.out.println("The Highest number is:"+b);
        }
    }
}
