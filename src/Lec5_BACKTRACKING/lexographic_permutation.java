package Lec5_BACKTRACKING;

import java.util.Scanner;

public class lexographic_permutation {
    public static void main(String[] args) {
        String s="aaa";
        int[] fre=frequency(s);
        int len=s.length();
        lexo(fre,"",len);
    }

    public static void lexo(int fre[], String processed, int len){
        if( len==0){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
            if(fre[i]>0){
                fre[i]--;
                lexo(fre,processed+(char)(i+'a'),len-1);
                fre[i]++;
            }

        }
    }
    private static int[] frequency(String s){
        int arr[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            arr[ch - 'a']++;}
            return arr;
//        }
//
//        }
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        int[] fre=frequency(str);
//        int len=str.length();
//        int ans=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int a=(int)(ch-'a');
//            ans=(ans*10)+a;
//        }
//        lexo(fre,"",len,ans);
//    }
//
//    public static void lexo(int fre[], String processed, int len,int p){
//        if( len==0){
//            int ans=0;
//            for(int i=0;i<processed.length();i++){
//                char ch=processed.charAt(i);
//                int a=(int)(ch-'a');
//                ans=(ans*10)+a;
//            }
//            if(ans<p){
//            System.out.println(processed);}
//            return;
//        }
//        for (int i = 0; i <fre.length ; i++) {
//            if(fre[i]>0){
//                fre[i]--;
//                lexo(fre,processed+(char)(i+'a'),len-1,p);
//                fre[i]++;
//            }
//
//        }
//    }
//    private static int[] frequency(String s){
//        int arr[]=new int[26];
//        for (int i = 0; i <s.length() ; i++) {
//            char ch = s.charAt(i);
//            arr[ch - 'a']++;}
//        return arr;
    }

}


