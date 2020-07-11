package Sorting_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        int len=n;
        System.out.println(mergeSort(arr));
    }
    public static int[] mergeSort(int[] arr){
        int mid=arr.length/2;
        if(arr.length<2){
            return arr;
        }
        int[] first= Arrays.copyOfRange(arr,0,mid);
        int[] second=Arrays.copyOfRange(arr,mid+1,arr.length);
        first=mergeSort(first);
        second=mergeSort(second);
        return mergeSort(first);
    }
}
