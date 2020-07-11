/*
Take as input str, a string.
a. Write a recursive function which counts the number of times ‘hi’ appears
in the string. Print the value returned.
b. Write a recursive function which removes all ‘hi’ in the string. Print the
value returned.
c. Write a recursive function which replaces all ‘hi’ in the string with ‘bye’.
Print the value returned.
 */

package Assignment_7_Recursion_string;

import java.util.Scanner;

public class remove_count_replace_substring {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
       // StringBuilder builder=new StringBuilder("");
        int i=0,count=0;
        System.out.println(count_hi(str,i,count));
        //int a=count_hi(str,i,count);
        remove_hi(str,"",len);
        replace_hi(str,"",len);
    }
    public static int count_hi(String str,int i,int count){
        if(i==str.length()-1){
            return count;
        }
        if( (str.charAt(i)=='h'&& str.charAt(i + 1)=='i')){
            count=count+1;
        }
        return count_hi(str,i+1,count);
    }
    public static void remove_hi(String str, String processed,int len){
        char ch_1,ch_2;
        if(len>1){

        if(str.charAt(0)=='h'&& str.charAt(1)=='i'){
            str=str.substring(2);
            len=len-2;
        }
        else{
            ch_1=str.charAt(0);
            str=str.substring(1);
            processed=processed+ch_1;
            len=len-1;

        }}
        if(len==1){
            ch_1=str.charAt(0);
            str=str.substring(1);
            processed=processed+ch_1;
            len=len-1;
        }
        if(len<=0){

            System.out.println(processed);
            return;
        }
        remove_hi(str,processed,len);
    }
    public static void replace_hi(String str, String processed,int len){
        String s1="bye";
        if(len>1){
            if(str.charAt(0)=='h' && str.charAt(1)=='i'){
                processed=processed+s1;
                str=str.substring(2);
                len=len-2;}
             else{
                char ch=str.charAt(0);
                processed=processed+ch;
                str=str.substring(1);
                len=len-1;
            }

            }
        if(len==1) {
            char ch = str.charAt(0);
            processed = processed + ch;
            str = str.substring(1);
            len = len - 1;
        }
        if(len<=0){
            System.out.println(processed);
            return;
        }

        replace_hi(str,processed,len);
    }

}
