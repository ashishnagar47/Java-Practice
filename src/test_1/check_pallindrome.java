package test_1;

import java.util.Scanner;

public class check_pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(check_pal(arr,0,n-1));
    }
    public static boolean check_pal(int arr[],int i,int n){
        if(n==0){
            return  true;
        }
        if(arr[n] != arr[i]){
            return false;
        }
        return check_pal(arr,i+1,n-1);

    }
}
