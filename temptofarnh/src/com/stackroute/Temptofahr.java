package com.stackroute;


import java.util.Scanner;

public class Temptofahr {

    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the serial no limit");
    int n = s.nextInt();
	int arr[] = new int[n+1];
	arr[0] =0;
	System.out.println("Sr.No\tTemperature(Celsius)\tTemperature(Fahrenheit)");
	for(int i=0; i<n; i++)
    {
    arr[i+1]=arr[i]+10;

    System.out.println("\t"+(i+1)+"\t\t\t"+arr[i]+"\t\t\t\t\t\t"+(((arr[i]*9)/5)+32));


    }
    }
}
