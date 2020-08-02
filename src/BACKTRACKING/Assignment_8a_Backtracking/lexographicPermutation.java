/*
Take as input str, a string. We are concerned with all possible permutations of
characters in str. E.g. “abc” can produce following words “abc”, “acb”, “bac”,
“bca”, “cab”, “cba”
a. Write a recursive function which returns the count of different
permutations for a given string. Print the value returned.
b. Write a recursive function which returns an ArrayList of permutations for a
given string. Print the value returned.
c. Write a recursive function which prints all possible permutations for a given
string (void is the return type for function).
 */

package BACKTRACKING.Assignment_8a_Backtracking;

import java.util.Scanner;

public class lexographicPermutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int len=str.length();
        int[] fre=frequency(str);
        lexo("",fre,len);
    }
    public static void lexo(String processed,int fre[],int len){
        if( len==0){
            System.out.println(processed);
            return;
        }
        for (int i = 0; i <fre.length ; i++) {
            if(fre[i]>0){
                fre[i]--;
                lexo(processed+(char)('a'+i),fre,len-1);
                fre[i]++;
            }
        }
    }

    private static int[] frequency(String str){
        int[] arr=new int[26];
        for (int i = 0; i < str.length() ; i++) {
            char ch=str.charAt(i);
            arr[ch-'a']++;
        }
        return arr;
    }
}
