package RECURSION.Assignment_6_Recursion;

import java.util.Scanner;

public class check_no_present_in_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int l=0;
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        System.out.println(check_no(arr,n,k,l));
    }
    public static boolean check_no(int a[],int n,int k,int l){
        if(l==n){
            return false;
        }
        if(a[l]==k){
            return true;
        }
        return check_no(a,n,k,l+1);
    }
}
