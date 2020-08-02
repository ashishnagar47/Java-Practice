package Basics.Lec3;

import java.util.Scanner;

public class nth_Fibonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=fab(n);
        System.out.println(a);
    }
    public static int fab(int n){
        if(n<2){
            return n;
        }
        return fab(n-1)+fab(n-2);

    }
}
