package RECURSION.Assignment_6_Recursion;

import java.util.Scanner;

public class check_sorted_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        System.out.println(check_sort(arr,n,k));
    }
    public static boolean check_sort(int a[],int n,int k){
        if(k==n-1){
            return true;
        }
        if(a[k]>a[k+1]){
            return false;
        }
        return check_sort(a , n, 1 + k);
    }
}
