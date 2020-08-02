package GFG_30days_of_coding.ArraysGFG;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t>0){
            int n=s.nextInt();
            pascal(n);
            t--;
        }
    }
    public static void pascal(int n){
        for (int i = 1; i <=n ; i++) {
            int C=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(C+" ");
                C=C*(i-j)/j;
            }
            System.out.println();
        }
    }
}
