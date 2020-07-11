/*
Take as input str, a string.
a. Write a recursive function which counts the number of times ‘hi’ appears
in the string – but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’.
Print the value returned.
b. Write a recursive function which removes all ‘hi’ in the string – but skip all
such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value returned.
c. Write a recursive function which replaces all ‘hi’ in the string with ‘bye’ –
but skip all such ‘hi’ which are followed by ‘t’ to form ‘hit’. Print the value
returned.
 */
package Assignment_7_Recursion_string;

import java.util.Scanner;

public class count_remove_replace_hi_but_not_hit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        int i=0;
        int count=0;
        System.out.println(count_hi(str,i,count));
        remove_hi(str,"",len);
        replace_hi(str,"",len);
    }
    public static int count_hi(String str,int i,int count){
        if(i==str.length()-1){
            return count;
        }
        if(str.charAt(i)=='h'&str.charAt(i+1)=='i') {
            if (i + 2 != str.length() && str.charAt(i + 2) != 't') {
                count = count + 1;
            }
            else if (i + 2 == str.length()) {
                count = count + 1;
            }
        }
        return count_hi(str,i+1,count);
    }
    public static void remove_hi(String str, String processed, int len) {
        char ch_1, ch_2;
        if (len > 2) {

            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                if (str.charAt(2) == 't') {
                    processed = processed + str.charAt(0) + str.charAt(1) + str.charAt(2);
                    str = str.substring(3);
                    len = len - 3;
                } else {
                  //  processed = processed + str.charAt(0) + str.charAt(1);
                    str = str.substring(2);
                    len = len - 2;

                }
            }
            else{
                ch_1=str.charAt(0);
                str=str.substring(1);
                processed=processed+ch_1;
                len=len-1;
            }
        }
        if (len == 2) {
            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
             //   processed = processed + str.charAt(0) + str.charAt(1);
                str = str.substring(2);
                len = len - 2;
            }
            else {
                ch_1 = str.charAt(0);
                processed = processed + ch_1+str.charAt(1);
                str = str.substring(2);
                len=len-2;
                }
        }
        if (len == 1) {
            ch_1 = str.charAt(0);
            str = str.substring(1);
            processed = processed + ch_1;
            len = len - 1;
        }
        if (len <= 0) {
            System.out.println(processed);
            return;
        }

           remove_hi(str,processed,len);
        }
        public static void replace_hi(String str,String processed,int len){
        String s_1="bye";
        char ch_1;
        if(len>2){
            if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                if (str.charAt(2) == 't') {
                    processed = processed + str.charAt(0) + str.charAt(1) + str.charAt(2);
                    str = str.substring(3);
                    len = len - 3;
                } else {
                    processed = processed + s_1.charAt(0) + s_1.charAt(1)+s_1.charAt(2);
                    str = str.substring(2);
                    len = len - 2;

                }
            }
            else{
                ch_1=str.charAt(0);
                str=str.substring(1);
                processed=processed+ch_1;
                len=len-1;
            }
        }
            if (len == 2) {
                if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
                    processed = processed + s_1.charAt(0) + s_1.charAt(1)+s_1.charAt(2);
                    str = str.substring(2);
                    len = len - 2;
                }
                else {
                    ch_1 = str.charAt(0);
                    processed = processed + ch_1+str.charAt(1);
                    str = str.substring(2);
                    len=len-2;
                }
            }
         /*   if (len == 1) {
                ch_1 = str.charAt(0);
                str = str.substring(1);
                processed = processed + ch_1;
                len = len - 1;
            }*/
            if (len <= 0) {
                System.out.println(processed);
                return;
            }
            replace_hi(str,processed,len);
    }
}