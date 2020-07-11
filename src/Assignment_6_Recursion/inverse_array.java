package Assignment_6_Recursion;

import java.util.Scanner;

public class inverse_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();

        }
        int index=0,ind=0;
        inverse(arr,n,index,ind);

    }
    public static void inverse(int arr[],int n,int index,int ind) {
        int[] inv = new int[n];
        if(index==n){
            return;
        }
        if(index==arr[ind]){
            System.out.println(inv[index]=ind);
            inverse(arr,n,index+1,0);
            return;

        }
        inverse(arr,n,index,ind+1);
        }

}