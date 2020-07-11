/*
 Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, .... z=26. Write
a recursive function (return type void) to print all possible codes for the string. E.g.
for “1123” possible codes are aabc, kbc, alc, aaw, kw
 */

package Assignment_7_Recursion_string;

import java.util.Scanner;

public class possible_codes_of_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    //    String str=s.nextLine();
        String str="1123";
        int len=str.length();
        int i=0;
        possible_codes(str,"",i,len);
    }
    public static void possible_codes(String unprocessed,String processed,int i,int len){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

//        int one = Integer.parseInt(unprocessed.substring(0,1)) - 1;
//        possible_codes(unprocessed.substring(1),processed+(char)(one +'a'));
//
//        if (unprocessed.length() > 1){
//            int two = Integer.parseInt(unprocessed.substring(0,2)) - 1;
//
//            if (two < 26){
//                possible_codes(unprocessed.substring(2), processed+(char)(two + 'a'));
//            }
//        }
        char ch_1=unprocessed.charAt(0);
        if(i<=len-2){
        char ch_2=unprocessed.charAt(1);
        String s_1="";
        s_1=s_1+ch_1+ch_2;
        int a_1=Integer.parseInt(s_1);
        //    System.out.println(a_1);
        if(a_1 < 26){
          //  processed=processed+(char)('a'+a_1);
            possible_codes(unprocessed.substring(2),processed+(char)('a'+a_1),i+2,len);
        }
        }
        int a_2=Integer.parseInt(String.valueOf(ch_1));
       // processed=processed+(char)('a'+a_2-1);
        possible_codes(unprocessed.substring(1),processed+(char)('a'+a_2-1),i+1,len);
    }

}
