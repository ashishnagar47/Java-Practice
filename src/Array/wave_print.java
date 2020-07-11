package Array;

import java.util.Scanner;

public class wave_print {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        // rowWiseWave(arr, row, col);
        //colWiseWave(arr,row,col);
        spiral(arr, row, col);
    }

    public static void rowWiseWave(int[][] arr, int row, int col) {
        int k = 0, l = 0;
        while (k < row) {
            if (k % 2 == 0) {
                for (int i = 0; i < col; i++) {
                    System.out.print(arr[k][i] + ", ");
                }
                k += 1;
            } else {
                for (int i = col - 1; i >= 0; i--) {
                    System.out.print(arr[k][i] + ", ");
                }
                k += 1;
            }
        }
        System.out.print("END");
    }

    public static void colWiseWave(int[][] arr, int row, int col) {
        int k = 0, l = 0;
        while (k < col) {
            if (k % 2 == 0) {
                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][k] + ", ");
                }
                k++;
            } else {
                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][k] + ", ");
                }
                k++;
            }

        }
        System.out.print("END");
    }

    public static void spiral(int[][] arr, int row, int col) {
        int k = row-1, m = col-1;
        int count = 0;
        int p = 0;
        while (k > 0 && m > 0) {
            int i=0,j=0;
            if (k % 2 == 0) {
                int a=row-k+1;
                int b=k+1;
                for (i = a; i <=b; i++) {
                    System.out.print(arr[count][i] + ", ");
                }
                k--;
                count = i-1;
            } else {
                for (i = k; i >= 0; i--) {
                    System.out.print(arr[count][i] + ", ");
                }
                k--;
                count=i+1;
            }

            if (m % 2 == 0) {
                int a=col-m+1;
                for (j = a; j < m; j++) {
                    System.out.print(arr[j][count] + ", ");
                }
                m--;
                count=j-1;
            } else {
                int a=col-m;
                for ( j = m - 1; j >= a; j--) {
                    System.out.print(arr[j][count] + ", ");
                }
                m--;
                count=j+1;
            }

        }
    }
}
