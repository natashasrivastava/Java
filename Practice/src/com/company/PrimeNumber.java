package com.company;

import java.util.Scanner;

public class PrimeNumber {
    static  boolean primecheck(int num)
    {
        if(num>=1 && num<=3 )
            return  true;
        for(int i=2;i<Math.sqrt(num);i++)
        {
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(primecheck(num)==false)
            System.out.println(num+" is not Prime.");
        else
            System.out.println(num+" is Prime");

    }
}
