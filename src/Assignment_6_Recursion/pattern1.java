/*
     Take as input N, a number. Print the following pattern (for N = 5)
*
* *
* * *
* * * *
* * * * *
 */

package Assignment_6_Recursion;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row=0;
        int col = 0;
        pattern(n,row, col);
    }
    public static void pattern(int n,int row,int col){
        if(row==n+1){
            return;
        }
        if(col==row){
            System.out.println();
            pattern(n,row+1,0);
            return;
        }
        System.out.print("*");
        pattern(n,row,col+1);
    }
}
