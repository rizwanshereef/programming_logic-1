package com.stackroute;

import java.util.Scanner;

/*Program to find the time from Speed and Distance*/
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/*Input the Distance and Speed*/
        System.out.println("Enter the Distance in Kilometer:");
        int dt = s.nextInt();
        System.out.println("Enter the Speed in Kilometer/Hour(km/h):");
        int spd = s.nextInt();
/*finding time*/
        double time = dt/spd;
        System.out.println("The time taken is: "+time+"hrs");
    }
}
