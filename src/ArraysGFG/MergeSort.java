package ArraysGFG;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        arr=Sort(arr);
        for (int i = 0; i <n ; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] Sort(int[] arr){
        if(arr.length<2){
            return arr;
        }
        int mid=arr.length/2;
        int[] first= Arrays.copyOfRange(arr,0,mid);
        int[] second= Arrays.copyOfRange(arr,mid,arr.length);

        first=Sort(first);
        second=Sort(second);
        return mergeSort(first,second);
    }

    public static int[] mergeSort(int[] first,int[] second){
        int[] a=new int[first.length+second.length];
        int k=0,i=0,j=0;
        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                a[k]=first[i];
                k++;
                i++;
            }
            else{
                a[k]=second[j];
                j++;
                k++;
            }
        }
        while(i<first.length){
            a[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            a[k]=second[j];
            j++;
            k++;
        }
        return a;
    }
}
