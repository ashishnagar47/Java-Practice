package Assignment_5_STRINGS;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] arr=new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextLine();
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i <n-1; i++) {
            String str1=arr[i];
            String str2=arr[i+1];
            if(str1.length()<=str2.length()){
                String s1=str2.substring(0,str1.length());
                if(str1.equals(s1)){
                    String s2=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=s2;
                }
            }
            else{
                String s1=str1.substring(0,str2.length());
                if(str2==s1){
                    String s2=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=s2;
                }
            }

        }
        for (int i = 0; i <n; i++) {
            System.out.println(arr[i]);
        }
    }
}
