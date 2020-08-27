package com.stackroute;

import java.util.Scanner;

/*Program to find the time from Speed and Distance*/

public class Time_Distance_Speed {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Input the Distance and Speed*/
        System.out.println("Enter the Distance in Kilometer:");
        int dt = scan.nextInt();
        System.out.println("Enter the Speed in Kilometer/Hour(km/h):");
        int spd = scan.nextInt();

/*finding time*/

        double time = dt/spd;
        System.out.println("The time taken is: "+time+"hrs");
    }
}
