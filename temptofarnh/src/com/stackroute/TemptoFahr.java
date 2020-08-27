package com.stackroute;


import java.util.Scanner;

/*program to generate temperture series in Celsius and Fahrenheit*/
public class TemptoFahr {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
/*Input the number of the series*/
	System.out.println("Enter the serial no limit");
    int numOne = scan.nextInt();
	int arr[] = new int[numOne+1];
	arr[0] =0;
	System.out.println("Sr.No\tTemperature(Celsius)\tTemperature(Fahrenheit)");
/*Generating the values and print result*/
	for(int i=0; i<numOne; i++){
    arr[i+1]=arr[i]+10;
    System.out.println("\t"+(i+1)+"\t\t\t"+arr[i]+"\t\t\t\t\t\t"+(((arr[i]*9)/5)+32));
    }
    }
}
