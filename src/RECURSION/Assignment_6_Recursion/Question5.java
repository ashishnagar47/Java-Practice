/*
 Take as input N, a number. Write a recursive function to find Nth triangle where
1 st triangle is 1, 2 nd triangle is 1 + 2 = 3, 3 rd triangle is 1 + 2 + 3 = 6, so on and so
forth. Print the value returned.
 */

package RECURSION.Assignment_6_Recursion;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
}
