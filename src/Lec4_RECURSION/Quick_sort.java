package Lec4_RECURSION;

import java.util.Arrays;
import java.util.Scanner;

public class Quick_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <arr.length-2; i=i+1) {
            swap(arr,i,i+2);
        }
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {

            return;
        }
        int p = pivot(arr, start, end);

        quickSort(arr, start, p - 1);
        quickSort(arr, p + 1, end);

    }

    public static int pivot(int arr[], int start, int end) {
        int j = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < arr[end]) {
                swap(arr, i, j);
                j++;
            }
        }
        swap(arr, j, end);
        return j;
    }

    public static void swap(int[] num, int j, int end) {
            int temp = num[j];
            num[j] = num[end];
            num[end] = temp;
    }
}
