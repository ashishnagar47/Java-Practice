package STRINGS;

import java.util.Scanner;

public class String_sort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       // sout
        int n=Integer.parseInt(s.nextLine());
        String[] arr=new String[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextLine();
        }
        int i=0;
        Sort(arr,i,n);
    }
    public static void Sort(String[] arr,int i,int len){
        if(i==len){
            return;
        }
        int p=0;
        for (int j = 0; j <len; j++) {
            String res="zzz";
            for (int k = 0; k <len ; k++) {
                    if(res.compareTo(arr[k])>0){
                        res=arr[k];
                        p=k;
                    }

            }
            System.out.println(res);
            arr[p]="zzzzzzzzz";

        }
    }
}
