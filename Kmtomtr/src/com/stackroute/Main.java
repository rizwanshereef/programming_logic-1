package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the distance in Kilometer");
        int n = s.nextInt();
        System.out.println("Distance in Kilometer: "+n+"km");
        System.out.println("Distance in meter: "+(n*1000)+"m");

    }
}
