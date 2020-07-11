package Assignment_8a_Backtracking;

import java.util.Scanner;

public class SumOfSubset {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        int targ=s.nextInt();
        subset(arr,n,targ);
    }
    public static void subset(int[] arr,int n,int targ){

    }
}
