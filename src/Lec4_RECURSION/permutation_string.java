package Lec4_RECURSION;

import java.util.Scanner;

public class permutation_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int len=s.length();
        per("",s);
    }
    public static void per(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        for(int i=0;i<=processed.length();i++){
            String first=processed.substring(0,i);
            String second=processed.substring(i);
            per(first+ch+second,unprocessed);
        }

    }
}
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        int len=str.length();
//        int ans=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int a=(int)(ch-'a');
//            ans=(ans*10)+a;
//        }
//        per("",str,ans);
//    }
//    public static void per(String processed,String unprocessed,int p){
//        if(unprocessed.isEmpty()){
//            int ans=0;
//            for(int i=0;i<processed.length();i++){
//                char ch=processed.charAt(i);
//                int a=(int)(ch-'a');
//                ans=(ans*10)+a;
//            }
//            if(ans>p) {
//                System.out.println(processed);
//            }
//            return;
//        }
//        char ch=unprocessed.charAt(0);
//        unprocessed=unprocessed.substring(1);
//        for(int i=0;i<=processed.length();i++){
//            String first=processed.substring(0,i);
//            String second=processed.substring(i);
//            per(first+ch+second,unprocessed,p);
//        }
//
//    }
//}
