package Array;

import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[][] arr=new int[3][3];

        int[][] arr_1={{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr_1.length ; i++) {
                if(i%2==0){
                    for (int j = 0; j <arr_1[i].length ; j++) {
                        System.out.println(arr_1[i][j]);
                    }

                }
                else{
                    for (int j = arr_1[i].length-1; j >=0 ; j--) {
                        System.out.println(arr_1[i][j]);
                    }

            }

        }
    }
}
