package Lec3;

import java.util.Scanner;

public class check_sorted_array_rec {
    public static void main(String[] args) {
        //     Scanner s = new Scanner(System.in);
//        int a[] = {1, 2, 4, 5};
//        int len;
//        len = a.length-1;
//        int index=0;
//        System.out.println(sorted(a,index,len));
//
//    }
//    public static boolean sorted(int arr[],int index,int len){
//
//        if(arr[index]>arr[index+1]){
//            return false;
//        }
//        if(index==len-1){
//
//            return true;
//        }
//        return sorted(arr,index+1,len);
//
//    }
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        ascii(str,"");
//        // Your Code Here
//    }
//    public static void ascii(String unprocessed,String processed){
//
//        for (int i = 0; i <unprocessed.length()-1 ; i++) {
//            processed=processed+unprocessed.charAt(i);
//            int a=unprocessed.charAt(i+1)-unprocessed.charAt(i);
//            processed=processed+a;
//        }
//        processed=processed+unprocessed.charAt(unprocessed.length()-1);
//        System.out.println(processed);
//    }
//}
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        int[] arr=frequency(str);
//        int max=0;
//        int j=0;
//        for (int i = 0; i <26 ; i++) {
//            if(arr[i]>max){
//                max=arr[i];
//                j=i;
//            }
//        }
//        char c= (char) ('a'+j);
//        System.out.println(c);
//    }
//    public static int[] frequency(String str){
//        int[] fre=new int[26];
//        for (int i = 0; i <str.length() ; i++) {
//            char ch=str.charAt(i);
//            fre[ch-'a']++;
//        }
//        return fre;
//    }
//}
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
    }
}
