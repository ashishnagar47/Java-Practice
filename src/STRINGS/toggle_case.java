package STRINGS;

import java.util.Scanner;

public class toggle_case {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        StringBuilder str_1=new StringBuilder(str);
        char ch;
        int len=str_1.length();
        for(int i=0;i<len;i++){
            ch=str_1.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)('A'+(ch-'a'));
            }
            else{
                ch=(char)('a'+(ch-'A'));
            }
            str_1.setCharAt(i,ch);

        }
        System.out.println(str_1);
    }
}
