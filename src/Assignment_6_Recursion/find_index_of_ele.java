/*
Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input M, a number. Write a recursive function which returns the first index
at which M is found in the array and -1 if M is not found anywhere. Print the value
returned
 */


package Assignment_6_Recursion;

import java.util.Scanner;

public class find_index_of_ele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int k=s.nextInt();
        int index=0;
        System.out.println(find_index(arr,n,k,index));
    }
    public static int find_index(int arr[],int n,int k,int index){
        if(index==n){
            return -1;
        }
        if(arr[index]==k){
            return index;
        }
        return find_index(arr,n,k,index+1);
    }
}
