package GFG_30days_of_coding.HashMaps;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsicutiveSequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for (int i = 0; i < t; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j] = s.nextInt();
            }
            subseq(arr);
        }
    }

    public static void subseq(int[] arr) {
        HashSet<Integer> set=new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {

            if(set.contains(arr[i]-1)){
                int j=arr[i];
                while(set.contains(j)) {
                    j++;

                    if (count < j - arr[i]) {
                        count = j - arr[i];
                    }
                }
            }
        }
        System.out.println(count);
    }
}
