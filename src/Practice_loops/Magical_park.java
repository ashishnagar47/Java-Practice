package Practice_loops;

import java.util.Scanner;

public class Magical_park {
        public static void main(String args[]) {
//            Scanner s=new Scanner(System.in);
//                        int row=s.nextInt();
//                        int col=s.nextInt();
//                        int k=s.nextInt();
//                        int S=s.nextInt();
//                        char[][] arr=new char[row][col];
//                        //    arr[3][3]={{'.','.','*'},{'.','#','.'},{'*','*','.'}};
//
//                        for(int i=0;i<row;i++){
//                            for(int j=0;j<col;j++){
//                                arr[i][j]=s.next().charAt(0);
//                            }
//                        }
//          /*  for(int i=0;i<row;i++){
//                for(int j=0;j<col;j++){
//                    System.out.print(arr[i][j]);
//                }
//            }*/
//
//                        find_strength(arr,S,k,row,col);
//                    }
//                    public static void find_strength(char arr[][],int S,int k,int row,int col){
//                        int i=0;
//                        while (i<row){
//                            int j=0;
//                            while (j<col){
//                                if(arr[i][j]=='.'){
//                        S=S-3;
//                        if(j==col-1){
//                            S=S+1;
//                        }
//                    }
//                    if(arr[i][j]=='*'){
//                        S=S+4;
//                        if(j==col-1){
//                            S=S+1;
//                        }
//
//                    }
//                    if(arr[i][j]=='#'){
//                        break;
//                    }
//                    j++;
//
//                }
//                i=i+1;
//                if(S<k){
//                    System.out.println("None");
//                }
//                return;
//            }
//            if(S>=k){
//                System.out.println("Yes");
//            }
//
//        }
//    }
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int m = s.nextInt();
            int k = s.nextInt();
            int ss = s.nextInt();
            char[][] ar = new char[n][];
            for (int i = 0; i <n ; i++) {
                ar[i] = new char[m];
                for (int j = 0; j <m ; j++) {
                    ar[i][j] = s.next().charAt(0);
                }
            }

            magical(ar,k,ss);
        }
    public static void magical(char[][] ar, int k, int s){

        boolean success = true;

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {

                char ch= ar[i][j];

                if (s < k){
                    success = false;
                    break;
                }

                if (ch == '.') {
                    s = s -2;
                }
                else if(ch == '*'){
                    s = s + 5;
                }
                else {
                    break;
                }

                if (j != ar[i].length-1){
                    s = s -1;
                }
            }
        }

        if (success){
            System.out.println("Yes");
            System.out.println(s);
        }
        else {
            System.out.println("No");
        }
    }
}


