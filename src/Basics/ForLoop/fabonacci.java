package Basics.ForLoop;

import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=0;
        int s1=1;
        int i=0;
        int fab;
        while(i<=n){
            fab=f+s1;
            f=s1;
            s1=fab;
            System.out.println(f);
            i++;
        }


    }
}
