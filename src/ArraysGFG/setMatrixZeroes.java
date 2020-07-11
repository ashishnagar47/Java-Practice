package ArraysGFG;

import java.util.Scanner;

public class setMatrixZeroes {
    public static void main(String[] args ) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t > 0) {
            int n = s.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <n ; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
            matrixzeroes(arr, n);
            t--;
        }
    }
    public static  void matrixzeroes(int[][] arr,int n){
        int[] row=new int[n];
        int[] col=new int[n];
        int[][] arr1=new int[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                if(arr[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if(row[i]==1 || col[j]==1){
                    arr1[i][j]=1;
                }
            }
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j]);
            }
            System.out.println();
        }
    }
}
