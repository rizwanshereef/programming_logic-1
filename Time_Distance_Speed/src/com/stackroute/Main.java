package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometer:");
        int dt = s.nextInt();
        System.out.println("Enter the Speed in Kilometer/Hour(km/h):");
        int spd = s.nextInt();
        double time = dt/spd;
        System.out.println("The time taken is: "+time+"hrs");
    }
}
