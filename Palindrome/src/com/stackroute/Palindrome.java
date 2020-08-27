package com.stackroute;

import java.util.Scanner;
/* Program to check if the number entered is palindrome */
public class Palindrome {
    String str;
    int num;
    public static void main(String[] args) {
        Palindrome m = new Palindrome();
        /*Add the number to be checked */
        m.add();
        /* Check if the number is valid integer or not*/
        if(m.checkint()) {
            m.checkpostive();
            m.pal();
            m.display();
        }
    }

    /*Method to add the number*/
    public void add( ){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        this.str = s.next();

    }
    /*Method to check if the number is positive or not*/
    public void checkpostive(){
        this.num= Integer.parseInt(str);
        if(num>0){
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The number is Negative");
        }

    }

    /* Method to check if the entered value is Integer or not*/
    public boolean checkint(){
        if (str.matches("[0-9]+") && str.length()>2){
            System.out.println("Entered string is Integer!");
            return true;
        }
        else {
            System.out.println("Not an Integer. Please enter integer");
            return false;
        }
    }

    /* Method to check if the number is palindrome or not by reversing the number*/
    public void pal(){
        int r;
        int sum=0;
        int temp = num;
        while (num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp == sum){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
        num = temp;
    }
    /*Method to display the result*/
    public void display(){
        System.out.println("The number is:"+num);
    }
}
