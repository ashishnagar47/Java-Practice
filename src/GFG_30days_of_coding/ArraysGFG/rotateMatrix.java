package GFG_30days_of_coding.ArraysGFG;

import java.util.Scanner;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int row=s.nextInt();
            int col=s.nextInt();
            int[][] arr=new int[row][col];
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <col ; j++) {
                    arr[i][j]=s.nextInt();
                }
            }
            rotate(arr,row,col);
            t--;
        }
    }
  //  1 2 3  ==> 7   4   1
  //  4 5 6 ==>  8   5   2
  //  7 8 9 ==>  9   6   3

    public static void rotate(int[][] arr,int row,int col){
        for (int i = 0; i <(row+1)/2 ; i++) {
            for (int j = i; j <(col+1)/2 ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[row-1-j][i];
                arr[row-1-j][i]=arr[row-1-i][col-1-j];
                arr[row-1-i][col-1-j]=arr[j][col-1-i];
                arr[j][col-1-i]=temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
