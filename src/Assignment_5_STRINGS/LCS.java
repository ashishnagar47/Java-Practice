package Assignment_5_STRINGS;

import java.util.Scanner;

public class LCS<n> {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));

        int n = s.nextInt();
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        //String p = "";
        for (int i = 0; i <n ; i++) {
            arr1[i]=s.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            arr2[i]=s.nextInt();
        }
        int count=0;
        for (int i = 0; i <n ; i++) {
            if(arr1[i]==arr2[i]){
                count++;
            }
            else{
                while(arr1[i]!=arr1[i]){

                }
            }
        }

       // System.out.println(str1);
    }
}