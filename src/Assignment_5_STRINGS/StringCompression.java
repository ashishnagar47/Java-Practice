/*
 Take as input S, a string. Write a function that does basic string compression. Print
the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.
 */

package Assignment_5_STRINGS;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        compress(str, "");
    }

    public static void compress(String unprocessed, String processed) {
        char ch = unprocessed.charAt(0);
        processed = processed + ch;
        int count = 1;
        for (int i = 1; i < unprocessed.length(); i++) {
            if (unprocessed.charAt(i - 1) == unprocessed.charAt(i)) {
                count += 1;
                if(i==unprocessed.length()-1){
                    processed=processed+count;
                }
            } else {
                if (count == 1) {
                    processed = processed +count+ unprocessed.charAt(i);
                    if(i==unprocessed.length()-1){
                        processed=processed+count;}
                } else {
                    processed = processed + count + unprocessed.charAt(i);
                }
                count=1;
            }
        }
        System.out.println(processed);
    }
}