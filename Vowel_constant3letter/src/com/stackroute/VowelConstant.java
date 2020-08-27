package com.stackroute;

import java.util.Scanner;
/*Program to check 3rd letter is vowel*/

public class VowelConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
/*Input the string*/
        System.out.println("Enter the string:");
        str= scan.next();
/*Convert the string to array*/
        char[] chars = str.toCharArray();
/*Take the 3rd letter by selecting the 2nd index from the array and compare with the condition and print if it is Vowel or not*/

        if(chars[2] =='a' || chars[2] =='e'||chars[2] =='i'||chars[2] =='o'||chars[2] =='u'){
            System.out.println("The 3rd letter is a Vowel");
        }
        else {
            System.out.println("The 3rd letter is a Constant");
        }
    }
}
