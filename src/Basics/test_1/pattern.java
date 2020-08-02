package Basics.test_1;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int row=0,col=0;
        pat(n,row,col);
    }
    public static void pat(int n,int row,int col){
        if(row==n+1){
            return;
        }
        if(row==col){
            System.out.println();
            pat(n,row+1,0);
            return;
        }
        System.out.print("*");
        pat(n,row,col+1);
}
}