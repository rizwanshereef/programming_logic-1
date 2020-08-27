package com.stackroute;

import java.util.Scanner;
/*  program to convert Kilometer into meter and display the result. */

public class Kmtomtr {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Input the distance */
        System.out.println("Enter the distance in Kilometer");
        int km = scan.nextInt();
        System.out.println("Distance in Kilometer: "+km+"km");
        /* Converting Kilometer to meter*/
        System.out.println("Distance in meter: "+(km*1000)+"m");

    }
}
