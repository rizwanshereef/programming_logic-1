package com.stackroute;

import java.util.Scanner;
/*Program to check 3rd letter is vowel*/
public class  Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
/*Input the string*/
        System.out.println("Enter the string:");
        str= s.next();
/*Convert the string to array*/
        char[] ch = str.toCharArray();
/*Take the 3rd letter by selecting the 2nd index from the array and compare with the condition and print if it is Vowel or not*/
        if(ch[2] =='a' || ch[2] =='e'||ch[2] =='i'||ch[2] =='o'||ch[2] =='u'){
            System.out.println("The 3rd letter is a Vowel");
        }
        else {
            System.out.println("The 3rd letter is a Constant");
        }
    }
}
