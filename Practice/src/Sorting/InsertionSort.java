package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertsortfunc(int[] arr, int n)
    {
        int i = 1;
        while (i < n) {
            int j = i;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                j--;

            }
            i++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        insertsortfunc(arr,n);

        System.out.println(Arrays.toString(arr));

    }
}
