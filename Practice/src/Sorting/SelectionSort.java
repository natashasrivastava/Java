package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void selectsort(int[] arr, int n)
    {
        int i=0;
        while(i<n-1)
        {
            int j = i;
            int minnum = i;
            while(j<n) {
                if (arr[j] < arr[minnum]) {
                    minnum = j;
                }

                j++;
            }
            int temp = arr[i];
            arr[i] = arr[minnum];
            arr[minnum]=temp;
            i++;
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
        selectsort(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}
