package Lec4_RECURSION;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class substring_rec {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        ArrayList l=new ArrayList();

        l.addAll(subsequence("", str));
        Collections.sort(l);
        for (int i = 0; i <l.size() ; i++) {
            System.out.println(l.get(i));
        }


    }

    public static ArrayList subsequence(String processed, String unprocessed) {
        ArrayList list=new ArrayList();
        if (unprocessed.isEmpty()) {
            //System.out.println(processed);
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        list.addAll(subsequence(processed, unprocessed));
        list.addAll(subsequence(processed + ch, unprocessed));
        //Collections.sort(list);
       // System.out.println(list);
        return list;
    }
}
//   public static void main(String[] args) {
//       Scanner s=new Scanner(System.in);
//       int t=s.nextInt();
//       String str=s.nextLine();
//       for (int i = 0; i <t ; i++) {
//           str="";
//           int n=s.nextInt();
//           int[] arr=new int[n];
//           for (int j = 0; j <n ; j++) {
//               arr[j]=s.nextInt();
//
//              // str="";
//               str=str+arr[j];
//           }
//          // System.out.println(sumArray(str,"",n));
//
//       }
//   }
//   public static int sumArray(String unprocessed,String processed,int n){
//       int count=0;
//
//        for (int i = 0; i < unprocessed.length(); i++) {
//            for (int j = i; j < unprocessed.length(); j++) {
//                processed =  unprocessed.substring(i, j+1);
//                int c=0;
//                for (int k = 0; k <processed.length() ; k++) {
//                     c=c+Character.getNumericValue(processed.charAt(k));
//                }
//                if(c%n==0){
//                    count++;
//                }
//
//                //System.out.println(processed);
//            }
//        }
//        return count;
//    }
//}
//   public static void main(String[] args) {
//       Scanner s = new Scanner(System.in);
//       String str = s.nextLine();
//       String c=str;
//       int ans=0;
//
//       for(int i=0;i<c.length();i++){
//           char ch=c.charAt(i);
//           int a=(int)(ch-'a');
//           ans=(ans*10)+a;
//           }
//
//       System.out.println(ans);
//       subsequence("", str,ans);
//
//   }
//
//    public static void subsequence(String processed, String unprocessed,int p) {
//        if(unprocessed.isEmpty()){
//            String c=processed;
//            int ans=0;
//
//                for(int i=0;i<c.length();i++){
//                    char ch=c.charAt(i);
//                    int n=(int)(ch-'a');
//                    ans=(ans*10)+n;
//                }
//
//
//            if(ans>p){
//                System.out.println(c);
//                return;
//            }
//            return;
//        }
//        char ch=unprocessed.charAt(0);
//        unprocessed=unprocessed.substring(1);
//        subsequence(processed,unprocessed,p);
//        subsequence(processed+ch,unprocessed,p);
//    }
//    // Your Code Here
//
//}


