package BACKTRACKING.Assignment_8a_Backtracking;

import java.util.Scanner;

public class nqueens {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        boolean[][] board=new boolean[row][row];
        nQueens(board,0);
        System.out.println();
        System.out.println(count(board,0));
    }
    public static void nQueens(boolean[][] board,int row){
        if(row==board.length){
            print(board);
            return;
        }
        for (int col = 0; col <board.length ; col++) {
            if(isSafe(board,row,col)){
                board[row][col]=true;
                nQueens(board,row+1);
                board[row][col]=false;
            }
        }
    }

    public static boolean isSafe(boolean board[][],int row,int col){
        for (int i = 0; i <row ; i++) {
            if(board[i][col]) {
                return false;
            }
        }
        int leftd=Math.min(row,col);
        for (int i = 0; i <=leftd ; i++) {
                if(board[row-i][col-i]){
                    return false;
            }
        }
        int rightd=Math.min(row,board.length-col-1);
        for (int i = 0; i <=rightd; i++) {
            if(board[row-i][col+i]){
                return  false;
            }
        }
        return true;
    }
    public static void print(boolean[][] board){
        for (int i = 0; i <board.length; i++) {
            for (int j = 0; j <board[i].length; j++) {
                if(board[i][j]){
                    System.out.print("{"+i+"-"+j+"}"+" ");
                }
            }
        }
    }
    public static int count(boolean[][] board,int row){
        if(row==board.length){
            return 1;
        }
        int count=0;
        for (int i = 0; i <board.length; i++) {
            if(isSafe(board,row,i)){
                board[row][i]=true;
                count+=count(board,row+1);
                board[row][i]=false;
            }
        }
        return count;
    }
}
