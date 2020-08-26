package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float sum =0;
        int inp[]= new int[5];
        /* Enter the number on to the array. */
        for (int i=0;i<5;i++) {
            System.out.println("Enter the " + (i + 1) + " number");
            inp[i] = s.nextInt();
            sum = sum + inp[i];
        }
        /* find the average*/
        float avg = (sum/5);
        System.out.println("The Sum of 5 numbers is: "+sum);
        System.out.println("The Average of 5 numbers is: "+avg);
    }
}
