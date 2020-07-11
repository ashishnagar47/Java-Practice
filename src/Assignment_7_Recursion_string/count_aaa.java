/*
Take as input str, a string
a. Write a recursive function which counts, the number of times “aaa”
appears in the string. Print the value returned.
b. Write a recursive function which counts, the number of times “aaa”
appears in the string, but only such instances of “aaa” should be
considered which do not overlap. Print the value returned.
 */
package Assignment_7_Recursion_string;

import java.util.Scanner;

public class count_aaa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int i=0;
        int count=0;
        System.out.println(count_aaa(str,i,count));
        System.out.println(count_non_overlapping_aaa(str,i,count));
    }
    public static int count_non_overlapping_aaa(String str,int i,int count){
        if(i>str.length()-3){
            return count;
        }
        if(i<=str.length()-3) {
            if (str.charAt(i) == 'a' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'a') {
                count = count + 1;
                i = i + 3;
            }
            else{
                i=i+1;
            }
        }
        return count_non_overlapping_aaa(str,i,count);
    }
    public static int count_aaa(String str,int i,int count){
        if(i>str.length()-3){
            return count;
        }
        if(i<=str.length()-3){
            if(str.charAt(i)=='a'&&str.charAt(i+1)=='a'&&str.charAt(i+2)=='a'){
                count=count+1;
                i=i+1;
            }
            else{
                i=i+1;
            }

        }
        return count_aaa(str,i,count);
    }
}