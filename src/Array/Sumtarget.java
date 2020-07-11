package Array;

import java.util.Scanner;

public class Sumtarget {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        String unprocessed="";
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            unprocessed=unprocessed+arr[i];
        }
        int target=s.nextInt();
        subset(unprocessed,"",target);
        //count(arr,target,0);
        // Your Code Here
    }
    public static void subset(String unprocessed,String processed,int t){

        if(unprocessed.isEmpty()){
            int sum=0;
            //String l=processed;
            if(!processed.isEmpty()){
                String l=processed;
                while(!processed.isEmpty()){
                    int c=Character.getNumericValue(processed.charAt(0));
                    if(!processed.isEmpty()){
                        processed=processed.substring(1);}
                    sum=sum+c;
                }
                if(sum==t){
                    for(int o=0;o<l.length();o++){
                        System.out.print(l.charAt(o)+" ");
                    }
                    System.out.print(" ");
                }}
            return;
        }
        int ch=Character.getNumericValue(unprocessed.charAt(0));
        subset(unprocessed.substring(1),processed,t);
        subset(unprocessed.substring(1),processed+ch,t);
    }

}