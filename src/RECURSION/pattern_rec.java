package RECURSION;

import java.util.Scanner;

public class pattern_rec {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=0;
        pattern(row,col);

    }
    public static void pattern(int row,int col){

        if(row==0){
            return;
        }
        if(col==row){
            System.out.println();
            pattern(row-1,0);
            return;
        }
        System.out.print("*");
        pattern(row,++col);
    }
}
