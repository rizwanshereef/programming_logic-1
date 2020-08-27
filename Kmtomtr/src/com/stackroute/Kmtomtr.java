package com.stackroute;

import java.util.Scanner;
/*  program to convert Kilometer into meter and display the result. */
<<<<<<< HEAD:Kmtomtr/src/com/stackroute/Kmtomtr.java
public class Kmtomtr {
=======
public class Main {
>>>>>>> 07b4a1ffcac19fc4394b91192a9576b3b3a0a3c6:Kmtomtr/src/com/stackroute/Main.java

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Input the distance */
        System.out.println("Enter the distance in Kilometer");
        int n = s.nextInt();
        System.out.println("Distance in Kilometer: "+n+"km");
        /* Converting Kilometer to meter*/
        System.out.println("Distance in meter: "+(n*1000)+"m");

    }
}
