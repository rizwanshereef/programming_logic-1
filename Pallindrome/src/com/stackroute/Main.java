package com.stackroute;

import java.util.Scanner;

public class Main {
    String str;
    int num;
    public static void main(String[] args) {
        Main m = new Main();
        m.add();
        if(m.checkint()) {
            m.checkpostive();
            m.pal();
            m.display();
        }
    }

    public void add( )
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        this.str = s.next();

    }

    public void checkpostive()
    {
        this.num= Integer.parseInt(str);
        if(num>0)
        {
            System.out.println("The number is Positive");
        }
        else
        {
            System.out.println("The number is Negative");
        }

    }
    public boolean checkint()
    {
    if (str.matches("[0-9]+") && str.length()>2)
    {
        System.out.println("Entered string is Integer!");
        return true;

       }
    else {
        System.out.println("Not an Integer. Please enter integer");
        return false;
    }
    }

    public void pal()
    {
        int r;
        int sum=0;
        int temp = num;
        while (num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp == sum)
        {
         System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
        num = temp;
    }

    public void display()
    {
        System.out.println("The number is:"+num);
    }
}
