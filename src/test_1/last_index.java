package test_1;

import java.util.Scanner;

public class last_index {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int b=n-1;
        int k=s.nextInt();
        index(arr,b,k);
    }
    public static void index(int arr[],int b,int k){
        if(b==-1){
            return;
        }
        if(arr[b]==k){
            System.out.println(b);
            return;
        }
        index(arr,b-1,k);
    }
}
