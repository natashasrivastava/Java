package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void bubble(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if (flag == 0)
                break;
        }

    }


    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        bubble(arr,n);
        System.out.println(Arrays.toString(arr));

    }
}
