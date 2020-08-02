package GFG_30days_of_coding.HashMaps;

import java.util.*;

public class twoSumProblem {
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

    public static void sum(int arr[] ,int target){
        Map<Integer,Integer> map= new HashMap();
        for (int i = 0; i <arr.length ; i++) {
            map.put(arr[i],i);
        }

        for (int i = 0; i <arr.length ; i++) {
            if(map.containsKey(target-arr[i]) && i != map.get(target-arr[i])){
                System.out.println("("+(target-arr[i])+","+(arr[i])+")");
                map.remove(arr[i]);
            }
        }
    }
}
