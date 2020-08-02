package GFG_30days_of_coding.HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class longestSubseqWithoutRepeat {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        longSubSeq(str);
    }
    public static void longSubSeq(String str){
        HashMap<Character, Integer> hm=new HashMap<>();
        int max_len=0;

        for (int i = 0; i <str.length() ; i++) {
            if(!hm.containsKey(str.charAt(i))){
                max_len+=1;
                hm.put(str.charAt(i),i);
            }
            else{
                
            }
        }
    }
}
