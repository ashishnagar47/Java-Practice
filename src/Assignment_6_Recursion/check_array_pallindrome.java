/*
 Take as input N, a number. Take N more inputs and store that in an array. Write a
recursive function which tests if the array is a palindrome and returns a Boolean
value. Print the value returned.
 */

package Assignment_6_Recursion;

import java.util.Scanner;

public class check_array_pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int[] rev=new int[n];
        int i=n-1;
        for (int j = 0; j <n ; j++) {
            rev[j]=arr[i];
            i=i-1;
        }
        System.out.println(pallindrome(arr,rev,n,0));
    }
    public static boolean pallindrome(int arr[],int rev[],int n,int index){
        if(index==n){
            return true;
        }
        if(arr[index]!=rev[index]){
            return false;
        }
        return pallindrome(arr,rev,n,index+1);
    }
}
