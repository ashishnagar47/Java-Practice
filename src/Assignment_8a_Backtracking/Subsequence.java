/*
Take as input str, a string. We are concerned with all the possible subsequences
of str. E.g. “abcd” has following subsequences “”, “d”, “c”, “cd”, “b”, “bd”, “bc”,
“bcd”, “a”, “ad”, “ac”, “acd”, “ab”, “abd”, “abc”, “abcd”.
a. Write a recursive function which returns the count of subsequences for a
given string. Print the value returned.
b. Write a recursive function which returns an ArrayList of subsequences for a
given string. Print the value returned.
c. Write a recursive function which prints all possible subsequences for a
given string (void is the return type for function).
 */

package Assignment_8a_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(count(str,""));
        System.out.println(arrList(str,""));
        subsequence(str,"");

    }
    public static int count(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=unprocessed.charAt(0);
        count+= count(unprocessed.substring(1),processed+ch);
        count+= count(unprocessed.substring(1),processed);
        return count;
    }
    public static ArrayList arrList(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        char ch=unprocessed.charAt(0);
        list.addAll(arrList(unprocessed.substring(1),processed+ch));
        list.addAll(arrList(unprocessed.substring(1),processed));
        return list;
    }
    public static void subsequence(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        subsequence(unprocessed.substring(1),processed+ch);
        subsequence(unprocessed.substring(1),processed);
    }
}
