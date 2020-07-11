package Lec4_RECURSION;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        long[] arr=new long[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        //int[] arr={5,4,9,8,2,3,7};
        //System.out.println(mergesort(arr));
       // merge_sort(a1,a2);
        arr=mergesort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    public static long[] merge_sort(long[] arr1,long[] arr2) {
        long[] res = new long[arr1.length + arr2.length];
        int i = 0, j = 0,k=0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                res[k] = arr1[i];
                k++;
                i++;
            } else {
                res[k] = arr2[j];
                j++;
                k++;
            }
        }
        while (i < arr1.length) {
            res[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            res[k] = arr2[j];
            k++;
            j++;
        }
        return res;
        }
    public static long[] mergesort(long arr[]){
        if(arr.length<2){
            return arr;
        }
        int mid=arr.length/2;
        long[] first= Arrays.copyOfRange(arr,0,mid);
        long[] second=Arrays.copyOfRange(arr,mid,arr.length);

        first=mergesort(first);
        second=mergesort(second);
        return merge_sort(first,second);
    }
}


