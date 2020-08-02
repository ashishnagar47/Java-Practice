package GFG_30days_of_coding.ArraysGFG;

import java.util.Scanner;

public class stockBuyAndSell {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
		while(t>0){
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        stock(arr,n);
        t--;
    }
}

    public static void stock(int[] arr,int n){
        int buy=0,sell=0;
        for(int i=1;i<n;i++){

            if(arr[i-1]<arr[i]){
                while(i<n){
                    if(arr[i-1]<arr[i]){
                        sell=i;

                    }
                    if(arr[i-1]<arr[i] &&i==n-1){
                        System.out.print("("+buy+" "+sell+")");

                    }
                    if(arr[i-1]>arr[i]){
                        System.out.print("("+buy+" "+sell+")");
                        buy=i;
                        break;
                    }
                    i++;

                }
            }

            else {
                buy=i;
            }
        }
        if( sell==0){
            System.out.print("No profit");
        }
        System.out.println();
    }
}
