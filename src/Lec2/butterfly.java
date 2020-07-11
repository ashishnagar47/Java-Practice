package Lec2;
import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=1,k=1;
        int n=s.nextInt();
        while(row<=2*n-1){
            int side=1;
            int col=1;
            while(col<=2*n-1){
                if(side<=k) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");}

                if(col<n){
                    side=side+1;
                }
                else{
                    side=side-1;
                }
                col++;
            }
                if(row<n){
                    k=k+1;
                }
                else{
                    k=k-1;
                }
            System.out.println();
                row++;
            }
        }
    }

