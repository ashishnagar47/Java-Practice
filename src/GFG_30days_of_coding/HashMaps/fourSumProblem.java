package GFG_30days_of_coding.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class fourSumProblem {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=s.nextInt();
            }
            int target=s.nextInt();
            sum(arr,target);
        }
    }

    public static class pair{
        int first,second;
        pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public static void sum(int[] arr,int target){
        HashMap<Integer,pair> map=new HashMap<>();
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                map.put((arr[i]+arr[j]),new pair(i,j));
            }
        }
        int s=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (map.containsKey(target - sum)) {
                    pair p = map.get(target - sum);
                    if (p.first != i && p.first != j && p.second != i && p.second != j) {
                        System.out.println("(" + arr[i] + "," + arr[j] + "," + arr[p.first] + "," + arr[p.second] + ")");
                        s=10;
                        return;
                    }
                }
            }
        }
        if(s==0){
            System.out.println("-1");
        }
    }
}
