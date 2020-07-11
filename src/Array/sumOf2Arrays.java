package Array;

import java.util.Scanner;

public class sumOf2Arrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n; i++) {
            arr[i]=s.nextInt();
        }
        int m=s.nextInt();
        int[] arr1=new int[m];
        for (int i = 0; i <m; i++) {
            arr1[i]=s.nextInt();
        }
        sum1(arr,n,arr1,m);
    }
    public static void sum1(int[] arr,int n,int[] arr1,int m){
        int c=0;
        if(n>m) {
            int a=n-m-1;
            int i,j=m-1;
            for (i = n-1; i > a; i--) {
                int f=0;
                 f= arr[i] + arr1[j];
                 int d=f;
                if(f>9){
                    f=f%10;

                }
                 arr[i]=f+c;
                if(d>9){
                    c=d/10;
                }
                j--;
                }
            if(c>0){
                arr[i]=arr[i]+c;
            }
            for (int k = 0; k <n ; k++) {
                System.out.print(arr[k]+", ");
            }
        }
        else if(n==m) {
            int i, j = m - 1;
            for (i = n - 1; i >= 0; i--) {
                if (i == 0) {
                    int f = 0;
                    f = arr[i] + arr1[j];
                    arr[i] = f + c;
                    for (int k = 0; k < n; k++) {
                        System.out.print(arr[k] + ", ");
                    }
                }
                else {
                    int f = 0;
                    f = arr[i] + arr1[j];
                    int d = f;
                    if (f > 9) {
                        f = f % 10;

                    }
                    arr[i] = f + c;
                    if (d > 0) {
                        c = d / 10;
                    }
                    j--;
                }
//                for (int k = 0; k < n; k++) {
//                    System.out.print(arr[k] + ", ");
//                }
            }
        }
        else {
            int a = m - n - 1;
            int j = n - 1;
            int i;

            for ( i = m - 1; i > a; i--) {
                int f=0;

                f= (arr1[i] + arr[j]);
                int d=f;
                if(f>9){
                    f=f%10;

                }

                arr1[i]=f+c;
                if(d>0){
                    c=d/10;
                }

                j--;
            }
            if(c>0){
                arr1[i]=arr1[i]+c;
            }
            for (int p = 0; p < m; p++) {
                System.out.print(arr1[p] + ", ");
            }
        }

        System.out.println("END");
    }
}
