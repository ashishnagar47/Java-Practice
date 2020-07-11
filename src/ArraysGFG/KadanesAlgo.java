package ArraysGFG;

import java.util.Scanner;

public class KadanesAlgo {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            largest(arr, n);
            t--;
        }
    }
    public static void largest(int[] arr,int n){
        int l=0,r=0;
        int max=Integer.MIN_VALUE,curr=0;
        for (int i = 0; i < n; i++) {
            curr=curr+arr[i];
            if(curr>max){
                max=curr;
            }
            if(curr<0){
                curr=0;
            }
        }
        System.out.println(max);
    }
}
