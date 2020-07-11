package Assignment_6_Recursion;

import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for (int row = 0; row <n ; row++) {
//            for (int space = 0; space <n-row-1; space++) {
//                System.out.print(" ");
//            }
            for (int col = 0; col <=row ; col++) {
                System.out.print(pascal1(n,row,col));
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static int pascal1(int n,int row,int col){
        int comb=fact(row)/(fact(col)*fact(row-col));
        return comb;
    }

    public static void pascal(int n,int row,int col){
        if(row==n){
            return;
        }
        if(col==row+1){
            System.out.println();
            pascal(n,row+1,0);
            return;
        }
        int comb=fact(row)/(fact(col)*fact(row-col));
        System.out.print(comb);
        pascal(n,row,col+1);
    }
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);

    }
}

