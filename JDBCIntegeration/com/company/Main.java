package com.company;

public class Main {
    private static  String value = "One";
    public static void main(String[] args) {
        switch (value){
            case "One":
                System.out.println("Ek number");
                break;

            default:
                System.out.println("Error 404");
                break;
        }
    }
}
