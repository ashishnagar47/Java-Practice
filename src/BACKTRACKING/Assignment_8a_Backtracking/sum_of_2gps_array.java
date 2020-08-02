package BACKTRACKING.Assignment_8a_Backtracking;

import java.util.Scanner;

public class sum_of_2gps_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        sumof2Groups(n,arr);
    }
    public static void sumof2Groups(int n,int[] arr){
        int[] list1=new int[10];
        int[] list2=new int[10];
        int i=0,j=0,sum1=0,sum2=0;
        if(i>=n){
            System.out.println(list1);
            System.out.println(list2);
            return;
        }
        while(i++<n){
            arr[i]--;
            while(j++<n){
                arr[j]--;
                if(i!=j){
                    list1[i]=
                    sum1=sum1+arr[i];
                  //  list2.add(arr[j]);
                    sum2=sum2+arr[j];
                }
             ///   arr
            }
        }
      //  if
    }
}
