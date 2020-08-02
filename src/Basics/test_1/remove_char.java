package Basics.test_1;

import java.util.Scanner;

public class remove_char {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a = "skhip";
        char ch=s.next().charAt(0);
        int i=0;
        remove("skip","",ch,i);
    }
    public static void remove(String unprocessed,String processed,char ch,int i){
        if(i==unprocessed.length()){
            System.out.println(processed);
            return;
        }
        char ch_1=unprocessed.charAt(i);
        if(ch_1!=ch){
            processed=processed+ch_1;
        }
        remove(unprocessed,processed,ch,i+1);
    }

}
