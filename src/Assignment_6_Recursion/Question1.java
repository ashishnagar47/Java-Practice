/*
Take as input N, a number. Print odd numbers in decreasing sequence (up until
        0) and even numbers in increasing sequence (up until N). E.g. for N = 6 print 5, 3,
        1, 2, 4.
*/
package Assignment_6_Recursion;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=n-1;
        int b =2;
        int j=n-2;
        odd_even(n, i,b,j);

    }

    public static void odd_even(int n, int i, int b,int j) {
        if(n%2==0){
            if(b==n){
                return;
            }
            if(i>0) {
                System.out.print(i);
                odd_even(n, i - 2, b,j);
                return;
            }
                System.out.print(b);
                odd_even(n, i, b + 2,j);
            }
        else{
            if(b==n+1){
                return;
            }
            if(j>0){
                System.out.print(j);
                odd_even(n,i-1,b,j-2);
                return;
            }
            System.out.print(b);
            odd_even(n, i, b + 2,j);


        }


        }
    }