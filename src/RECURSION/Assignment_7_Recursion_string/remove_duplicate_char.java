/*
Take as input str, a string. Write a recursive function which returns a new string in
which all duplicate consecutive characters are reduced to a single char. E.g. for
“hello” return “helo”. Print the value returned.
 */

package RECURSION.Assignment_7_Recursion_string;

import java.util.Scanner;

public class remove_duplicate_char {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder builder=new StringBuilder("");
        System.out.println(remove(str,builder,0));
    }
    public static CharSequence remove(String str,StringBuilder builder,int i){
        if(i==str.length()-1){
            builder.append(str.charAt(i));
            return builder;
        }
        if(str.charAt(i)!=str.charAt(i+1)){
            builder.append(str.charAt(i));
        }
        return remove(str,builder,i+1);
    }

}
