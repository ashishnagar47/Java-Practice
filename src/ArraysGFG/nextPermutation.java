package ArraysGFG;

import java.util.Scanner;

public class nextPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            nextPerm(arr,n);
            t--;
        }
    }

    public static void nextPerm(int[] arr, int n){
        int d=0,x=0,curr=0,pos=0;
        for (int i = n-1; i >1 ; i--) {
            if(arr[i]>arr[i-1]){
                d=arr[i-1];
                x=i-1;
                break;
            }
        }
        int min=Integer.MAX_VALUE;
        int y=x;
        while(x+1<n){
            if(arr[x+1]>d){
            curr=arr[x+1]-d;
            if(curr<min){
                min=curr;
                pos=x+1;
            }}
            x++;
        }

        swap(arr,pos,y);
       int p=n-1;
        while(y+1<p){
            swap(arr,y+1,p);
            y++;
            p--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


    }
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
