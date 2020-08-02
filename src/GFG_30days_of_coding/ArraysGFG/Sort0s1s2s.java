package GFG_30days_of_coding.ArraysGFG;

import java.util.Scanner;

public class Sort0s1s2s {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int t=s.nextInt();
//        while(t>0){
//            int n=s.nextInt();
//            int[] arr=new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]=s.nextInt();
//            }
//            sort(arr,n);
//            t--;
//        }
//    }
//    public static void sort(int[] arr,int n){
//        int zero=0,one=0,two=0;
//        for(int i=0;i<n;i++) {
//            if(arr[i]==0){
//                zero+=1;
//            }
//            if(arr[i]==1){
//                one+=1;
//            }
//            if(arr[i]==2){
//                two+=1;
//            }
//        }
//        int j=0;
//        while(zero>0){
//            arr[j]=0;
//            zero--;
//            j++;
//        }
//        while(one>0){
//            arr[j]=1;
//            one--;
//            j++;
//        }
//        while(two>0){
//            arr[j]=2;
//            two--;
//            j++;
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//
//    }
//}


// DUTCH FLAG ALGORITHM

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        sort(arr, n);
    }

    public static void sort(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0: {
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    int temp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp;
                    high--;
                    break;
                }
            }
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]);
        }
    }
}