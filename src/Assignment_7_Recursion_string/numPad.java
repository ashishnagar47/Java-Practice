/*
Take as input str, a string. str represents keys pressed on a nokia phone keypad.
We are concerned with all possible words that can be written with the pressed
keys. E.g. “12” can produce following words “ad”, “ae”, “af”, “bd”, “be”, “bf”,
“cd”, “ce”, “cf”
a. Write a recursive function which returns the count of words for a given
keypad string. Print the value returned.
b. Write a recursive function which returns an ArrayList of words for a given
keypad string. Print the value returned.
c. Write a recursive function which prints all possible words for a given
keypad string (void is the return type for function).
 */

package Assignment_7_Recursion_string;

import java.util.ArrayList;
import java.util.Scanner;

public class numPad {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(count(str,""));
        System.out.println(Arrlist(str,""));
        numPad(str,"");
    }
    public  static int count(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count=0;
        char ch=unprocessed.charAt(0);
        int num=Integer.parseInt(String.valueOf(ch));
        for (int i =3*num-3; i <3*num ; i++) {
            if(i==26){
                continue;
            }
            char c= (char) ('a'+i);
            count+=count(unprocessed.substring(1),processed+c);
        }
        return count;
    }
    public static ArrayList Arrlist(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            ArrayList list=new ArrayList();
            list.add(processed);
            return list;
        }
        ArrayList list=new ArrayList();
        char ch=unprocessed.charAt(0);
        int num=Integer.parseInt(String.valueOf(ch));
        for (int i =3*num-3; i <3*num ; i++) {
            if(i==26){
                continue;
            }
            char c= (char) ('a'+i);
            list.addAll(Arrlist(unprocessed.substring(1),processed+c));
        }
        return list;
    }

    public static void numPad(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        int num=Integer.parseInt(String.valueOf(ch));
        for (int i =3*num-3; i <3*num ; i++) {
            if(i==26){
                continue;
            }
            char c= (char) ('a'+i);
            numPad(unprocessed.substring(1),processed+c);
        }
      //  numPad(unprocessed,processed);
    }
}
