package Basics;

import java.util.ArrayList;

import java.util.*;
import java.io.*;

public class Questions {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j=0;j<n;j++)
            {
                int temp1 =a;
                for(int k = 0;k<=j;k++)
                {

                    temp1+=(Math.pow(2,k)*b);
                }
                System.out.print(temp1 + " ");
            }
        }
        in.close();
    }
}


class Solution{
    public static void main(String []argh){
    String s = new String();

    }
}
