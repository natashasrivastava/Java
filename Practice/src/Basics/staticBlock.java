package Basics;


import java.util.Scanner;

public class staticBlock {
    static Scanner scan = new Scanner(System.in);
    static int s = scan.nextInt();
    static{
        System.out.println("Hello");

    }
    static {
        System.out.println("Natasha");
    }
    public static void main(String[] args) {
        System.out.println("Hi");
        System.out.println(s);
    }
}
