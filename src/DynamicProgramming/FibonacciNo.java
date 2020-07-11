package DynamicProgramming;

import java.util.Scanner;

public class FibonacciNo {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Integer[] arr=new Integer[n+1];
        System.out.println(fiboDpRec(n,arr));
        System.out.println(fibo(5));
        System.out.println(fiboDpItr(n,arr));
    }


    public static int fibo(int n) {

        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static int fiboDpRec(int n,Integer mem[]){
        if(n<2){
            return n;
        }
        if(mem[n]!=null){
            return mem[n];
        }
        mem[n]=fiboDpRec(n-1,mem)+fiboDpRec(n-2,mem);
        return mem[n];
    }

    public static int fiboDpItr(int n,Integer mem[]){
        mem[0]=0;
        mem[1]=1;

        for (int i = 2; i <=n ; i++) {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }
}
