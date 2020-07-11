package Lec2;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        int row=1,col=1,k=1;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(row=1;row<=n;row++){
            for(col=1;col<=k;col++){
                System.out.print("*");

            }
            if(row<=n/2){
                k=k+1;
            }
            else{
                k=k-1;
            }
            System.out.println();
        }
    }
}
