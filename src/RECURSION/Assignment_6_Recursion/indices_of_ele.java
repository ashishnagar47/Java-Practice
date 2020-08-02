/*
 Take as input N, the size of array. Take N more inputs and store that in an array.
Take as input M, a number. Write a recursive function which returns an array
containing indices of all items in the array which have value equal to M. Print all
the values in the returned array.
 */

package RECURSION.Assignment_6_Recursion;

import java.util.Scanner;

public class indices_of_ele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int ele=s.nextInt();
        int index=0;
        find_indices(arr,n,ele,index);
    }
    public static void find_indices(int arr[],int n,int ele,int index){
        if(index==n){
            System.out.print(-1);
            return;

        }
        if(arr[index]==ele){
            System.out.println(index);
        }
        find_indices(arr,n,ele,index+1);

    }
}