package Basics.Lec3;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
      //  pd4(n);
        int a=fact(n);
        System.out.println(a);
    }
   /* public static void pd4(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        pd4(n - 1);
        System.out.print(n+" ");
    }
*/
    public static int fact(int n) {
        if(n==1){
            return 1;
        }
        return n*fact(n-1);

    }

}
