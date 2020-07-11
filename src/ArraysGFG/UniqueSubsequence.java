package ArraysGFG;

import java.util.Scanner;

public class UniqueSubsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=Integer.parseInt(s.nextLine());
        while(t>0){
            int n=Integer.parseInt(s.nextLine());
            String str=s.nextLine();
            subseq(str,n);
            t--;
        }
    }
    public static void subseq(String str,int n){
        int[] a=new int[26];
        int count=0;
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int p=ch-'a';
            a[p]++;
        }
        for(int i=0;i<26;i++){
            if(a[i]==0){
                System.out.println("No subsequence Exist");
                return ;
            }
            else{
                a[i]--;
            }
            count=1;
        }
        for(int i=0;i<26;i++){
            if(a[i]>0){
                count+=a[i];
            }
        }
        System.out.println(count);
        return;
    }
}
