package Basics.Practice_loops;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int t=s.nextInt();
        for (int i = 0; i <t; i++) {
            int a=s.nextInt();
            int b=s.nextInt();
            int n=s.nextInt();
            int place=1;
            int c=0;
            for (int j = 0; j <n ; j++) {
                c=b*place+c;
                System.out.print(a+c+" ");
                place=place*2;
            }
            System.out.println();
                
        }
        }
}
