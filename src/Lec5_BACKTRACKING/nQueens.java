package Lec5_BACKTRACKING;

public class nQueens {
    public static void main(String[] args) {
        boolean board[][] = new boolean[4][4];
        nqueens(board, 0);
        System.out.println(count(board, 0));
    }

    public static void nqueens(boolean board[][], int row) {
        if (row == board.length) {
            print(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                nqueens(board, row + 1);
                board[row][col] = false;
            }
        }
    }

    public static boolean isSafe(boolean board[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int leftd = Math.min(row, col);
        for (int i = 1; i <= leftd; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        int rightd = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= rightd; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }

    private static void print(boolean board[][]) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("Q");
                } else {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static int count(boolean board[][], int row) {
        if (row == board.length) {
            //print(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += count(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }
}