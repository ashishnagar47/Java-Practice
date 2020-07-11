package Assignment_5_STRINGS;

import java.util.Scanner;

public class inc_odd_char_dec_even_char<i, len1> {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len1 = str.length() - 1;
        StringBuilder st=new StringBuilder(str);
        int i;
        char ch;
        for (i = 0; i <= len1; i++) {
            ch=str.charAt(i);
            int a=ch;
            if(a%2==0){
                ch = (char) (ch - 1);}
            else {
                ch= (char) (ch+1);
            }
            st.setCharAt(i,ch);

        }
        System.out.println(st);

        }
    }

