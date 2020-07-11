//Given an unsorted array of nonnegative integers, find a continuous subarray which adds to a given number.
//        Examples :
//
//        Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
//        Ouptut: Sum found between indexes 2 and 4
//        Sum of elements between indices
//        2 and 4 is 20 + 3 + 10 = 33
//
//        Input: arr[] = {1, 4, 0, 0, 3, 10, 5}, sum = 7
//        Ouptut: Sum found between indexes 1 and 4
//        Sum of elements between indices
//        1 and 4 is 4 + 0 + 0 + 3 = 7
//
//        Input: arr[] = {1, 4}, sum = 0
//        Output: No subarray found
//        There is no subarray with 0 sum


package ArraysGFG;

import java.util.Scanner;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int sum=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            //int sum=sc.nextInt();
            sumSubarray(arr,sum,n);
            t--;
        }
    }
    public static void sumSubarray(int arr[], int sum, int n){
        int currSum=0;
        for(int i=1;i<=n;i++){
            currSum=arr[i-1];
            for(int j=i;j<=n;j++){
                if(currSum==sum){
                    int p=j;
                    System.out.println(i+" "+p);
                    return;
                }
                if(currSum>sum || j==n){
                    break;
                }
                currSum+=arr[j];
            }
            currSum=0;
        }
        System.out.println("-1");
    }
}
