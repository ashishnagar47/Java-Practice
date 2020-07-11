package Assignment_8a_Backtracking;

import java.util.Scanner;

public class RatInAMaze {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        st=st.replaceAll("\\s","");
        int row=Character.getNumericValue(st.charAt(0));
        int col=Character.getNumericValue(st.charAt(1));
        String[] array=new String[row];
        for (int i = 0; i <row; i++) {
            //for (int j = 0; j <col ; j++) {
                array[i]=s.nextLine();

        }
        char[][] arr=new char[row][col];
        for (int i = 0; i <row ; i++) {
            String str=array[i];
            str=str.replaceAll("\\s","");
            for (int j = 0; j <str.length() ; j++) {
                char ch=str.charAt(j);
                arr[i][j]=ch;
            }
        }
        int[][] ar=new int[row][col];
        if(maze(arr,ar,0,0,row,col)){
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j <col; j++) {
                    System.out.print(ar[i][j]);
                }
                System.out.println();
            }
        }
        else{
            System.out.println("NO PATH FOUND");
        }
    }

    public static boolean maze(char[][] arr,int[][] ar,int r,int c,int row,int col) {

        if (row-1 == r&&col-1==c) {
            if(arr[r][c]=='O'){
                ar[r][c]=1;
            return true;
            }
            else{
                return false;
            }
        }
            if(isSafe(arr,r,c,row,col)) {
                ar[r][c] = 1;
                if (maze(arr, ar, r, c + 1, row, col)) {
                    return true;
                }
                if (maze(arr, ar, r + 1, c, row, col)) {
                    return true;
                }
                ar[r][c] = 0;
                return false;
            }

            return false;

       // return false;
    }

    public static boolean isSafe(char[][] arr,int r,int c,int row,int col){
        if((r>=0)&&(r<row) &&(c>=0)&& (c<col)){
            if(arr[r][c]=='O'){
                return true;
            }
           // return false;
        }
        return false;
    }

}

