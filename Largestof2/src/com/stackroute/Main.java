package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int a = s.nextInt();
        System.out.println("Enter the 2nd number:");
        int b = s.nextInt();
        if(a>b)
        {
            System.out.println("The Highest number is:"+a);

        }
        else
        {
            System.out.println("The Highest number is:"+b);
        }
    }
}
