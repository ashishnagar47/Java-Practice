package GFG_30days_of_coding.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class largestSubarrayWithSumO {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j] = s.nextInt();
            }
            largestSubseq(arr);
        }
    }

    public static void largestSubseq(int[] arr){
        HashMap<Integer,Integer> hM=new HashMap<>();
        int max_len=0;
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            if(arr[i]==0 && max_len==0){
                max_len=1;
            }

            if(sum==0){
                max_len=i+1;
            }

                Integer prev_i=hM.get(sum);

                if(prev_i!=null){
                    max_len=Math.max(max_len,i-prev_i);
                }
                else{
                    hM.put(sum,i);
                }
            }
        System.out.println(max_len);
    }
}
