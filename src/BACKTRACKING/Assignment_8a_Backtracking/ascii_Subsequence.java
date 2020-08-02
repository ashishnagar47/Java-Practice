/*
Take as input str, a string. We are concerned with all the possible ascii-
subsequences of str. E.g. “ab” has following ascii-subsequences “”, “b”, “98”,
“a”, “ab”, “a98”, “97”, “97b”, “9798”
a. Write a recursive function which returns the count of ascii-subsequences
for a given string. Print the value returned.
b. Write a recursive function which returns an ArrayList of ascii-subsequences
for a given string. Print the value returned.
c. Write a recursive function which prints all possible ascii-subsequences for a
given string (void is the return type for function).
 */

package BACKTRACKING.Assignment_8a_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class ascii_Subsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(count(str,""));
        System.out.println(Arrlist(str,""));
        ascii_sub(str,"");
    }
    public static int count(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=unprocessed.charAt(0);
        int n=ch;
        count+=count(unprocessed.substring(1),processed+ch);
        count+=count(unprocessed.substring(1),processed+n);
        count+=count(unprocessed.substring(1),processed);
        return count;
    }
    public static ArrayList Arrlist(String unprocessed ,String processed){
        if (unprocessed.isEmpty()){
            ArrayList list=new ArrayList();
            list.add(processed);
            return list;
        }
        ArrayList list=new ArrayList();
        char ch=unprocessed.charAt(0);
        int n=ch;
        list.addAll(Arrlist(unprocessed.substring(1),processed+(ch)));
        list.addAll(Arrlist(unprocessed.substring(1),processed+n));
        list.addAll(Arrlist(unprocessed.substring(1),processed));
        return list;

    }
    public static void ascii_sub(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        int n=ch;
        ascii_sub(unprocessed.substring(1),processed+(ch));
        ascii_sub(unprocessed.substring(1),processed+n);
        ascii_sub(unprocessed.substring(1),processed);
    }
    
}
