package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        if(n%2==0)
        {
            System.out.println("The entered value is Even");
        }
        else
        {
            System.out.println("The entered value is Odd");
        }
    }
}
