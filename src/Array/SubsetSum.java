package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        for (int i = 0; i <t; i++) {
//            int n=s.nextInt();
//            int[] arr=new int[n];
//            String p="";
//            for (int j = 0; j <n ; j++) {
//                arr[i]=s.nextInt();
//                p=p+arr[i];
//            }
//            sum(p,"");
//        }
//    }
//    public static void sum(String p,String unprocessed){
//        if(p.isEmpty()){
//            int sum=0;
//            for (int i = 0; i <unprocessed.length() ; i++) {
//                sum=sum+Character.getNumericValue(unprocessed.charAt(i));
//            }
//            if(sum==0){
//                System.out.println("Yes");
//                return;
//            }
//            return;
//        }
//        char ch=p.charAt(0);
//        sum(p.substring(1),unprocessed);
//        sum(p.substring(1),unprocessed+ch);
//    }
//}


        //DOES SUBSET SUM EQUALS TO GIVEN SUM OR NOT
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int sum=s.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));
        if(subsetSum(arr,size,sum)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    public static boolean subsetSum(int[] arr,int size,int sum) {
        int l = 0, r = 0;
        int a = 0;
        while (l <= r &&r<size) {
            for(int i=l;i<=r;i++){
                a=a+arr[i];
            }
            if (sum == a) {
                return true;
            }
            else if (sum > a) {
                r++;
            }
            else{
               l++;
            }
            a=0;
        }
        return false;
    }
}