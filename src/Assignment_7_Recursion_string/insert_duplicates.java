/*
Take as input str, a string. Write a recursive function which returns a new string in
which all duplicate consecutive characters are separated by a ‘*’. E.g. for
“hello” return “hel*lo”. Print the value returned.
 */
package Assignment_7_Recursion_string;

import java.util.Scanner;

public class insert_duplicates {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        String str=s.nextLine();
//        StringBuilder builder=new StringBuilder("");
//        int i=0;
//        System.out.println(insert(builder,str,i));
//    }
//    public static Object insert(StringBuilder builder,String str, int i){
//        builder.append(str.charAt(i));
//        if(i==str.length()-1){
//            return builder;
//        }
//
//        if(str.charAt(i)==str.charAt(i+1)){
//            builder.append("*");
//        }
//        return insert(builder,str,i+1);
//
//    }
//}
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        pushX(str,len);
    }
    public static void pushX(String str,int len){
        String processed="";
        int count=0;
        for (int i = 0; i <len; i++) {
            if(str.charAt(i)!='x'){
                processed=processed+str.charAt(i);
            }
            else{
                count+=1;
            }
        }
        while(count>0){
            processed=processed+'x';
            count--;
        }
        System.out.println(processed);
    }
}
