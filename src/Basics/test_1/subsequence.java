package Basics.test_1;

import java.util.Scanner;

public class subsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a="abc";
        subseq("","abc");
    }
    public static void subseq(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch=unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);
        subseq(processed+ch,unprocessed);
        subseq(processed,unprocessed);

    }
}
