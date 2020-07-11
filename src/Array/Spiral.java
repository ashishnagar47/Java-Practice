package Array;

import java.util.Scanner;

public class Spiral {
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
        spiral(arr, row, col);
    }

    public static void spiral(int[][] arr, int row, int col) {
        int a = 0, b = 0, c = 0, d = 0;
        int j = 0;
        int pos = 0;
        int n;
        int count = 0;
        int m = row * col;
        while (count < m) {
            if (count < m) {
                for (j = a; j < col - a; j++) {
                    n = arr[pos][j];
                    count++;
                    System.out.print(n + ", ");
                }
            }
            if (count < m) {
                a++;
                pos = j - 1;
                for (j = b + 1; j < row - b; j++) {
                    n = arr[j][pos];
                    count++;
                    System.out.print(n + ", ");
                }
            }
            if (count < m) {
                b++;
                pos = j - 1;
                for (j = col - c - 2; j >= c; j--) {
                    n = arr[pos][j];
                    count++;
                    System.out.print(n + ", ");
                }
            }
            pos = j+1;
            c++;
            if (col < m) {
                for (j = row - d - 2; j > d; j--) {
                    n = arr[j][pos];
                    count++;
                    System.out.print(n + ", ");
                }
            }
            pos = j + 1;
            d++;
        }
        System.out.println("END");
    }
}
