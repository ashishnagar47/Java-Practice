/*How many ways are there to place a black and a white knight on an N * M chessboard such that they do not attack each other? The knights have to be placed on different squares. A knight can move two squares horizontally and one square vertically (L shaped), or two squares vertically and one square horizontally (L shaped). The knights attack each other if one can reach the other in one move.

Input:
The first line contains the number of test cases T. Each of the next T lines contains two integers N and M which is size of matrix.

Output:
For each testcase, print the required answer, i.e, number of possible ways to place knights.

Constraints:
1 <= T <= 100
1 <= N, M <= 105

Example:
Input:
3
2 2
2 3
4 5

Output:
12
26
312*/

package BACKTRACKING;

import java.util.Scanner;

public class Black_White_Knight {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0){
            int n = s.nextInt();
            int m = s.nextInt();

            boolean[][] board = new boolean[n][m];
            System.out.println(countWays(board,0, 0));
        }
    }

    public static int countWays(boolean[][] board, int curRow, int curCol) {
        if (curRow == board.length){
            return 0;
        }

        int cnt = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == curRow && j == curCol){
                    continue;
                }
                if(isSafe(board, curRow, curCol, i, j)){
                    cnt += 1;
                }
            }
        }

        if (curCol < board[0].length-1){
            cnt += countWays(board, curRow,curCol+1);
        }
        else {
            cnt += countWays(board, curRow+1, 0);
        }
        return cnt;
    }

    public static boolean isSafe(boolean[][] board, int curRow, int curCol, int nextRow, int nextCol) {
        if (Math.abs(curCol-nextCol) == 2 && Math.abs(curRow-nextRow) == 1){
            return false;
        }

        if (Math.abs(curCol-nextCol) == 1 && Math.abs(curRow-nextRow) == 2){
            return false;
        }

        return true;
    }
}