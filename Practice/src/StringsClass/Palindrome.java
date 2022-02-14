package StringsClass;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner in = new Scanner(System.in);
        double d = 43.7;
        Double d1 = 65.9;


        String s = in.next();
        int len = s.length();
        for(int i=0;i<len/2;i++){
            if(s.charAt(i)!=s.charAt(len-i-1))
            {
                System.out.println("String is not Palindrome");
                return;
            }


        }
        System.out.println("String is Palindrome");

    }
}
