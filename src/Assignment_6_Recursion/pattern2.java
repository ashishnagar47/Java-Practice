package Assignment_6_Recursion;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=0;
        pat(row,col);
    }
    public static void pat(int row,int col){
        if(row==0){
            return;
        }
        if(col==row){
            System.out.println();
            pat(row-1,0);
            return;
        }
        System.out.print("*");
        pat(row,col+1);
    }
}
