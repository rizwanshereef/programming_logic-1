package com.stackroute;

import java.util.Scanner;

public class  Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        System.out.println("Enter the string:");
        str= s.next();
        char[] ch = str.toCharArray();
        if (ch[2] =='a' || ch[2] =='e'||ch[2] =='i'||ch[2] =='o'||ch[2] =='u')
        {
            System.out.println("The 3rd letter is a Vowel");
        }
        else {
            System.out.println("The 3rd letter is a Constant");
        }
    }
}
