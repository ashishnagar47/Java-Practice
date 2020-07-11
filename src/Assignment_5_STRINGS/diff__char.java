package Assignment_5_STRINGS;

import java.util.Scanner;

public class diff__char {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
      //  StringBuilder str_1 = new StringBuilder(str);
        int len = str.length();

        char ch_1,ch_2;
        int a;
        for (int i = 0; i <len-1 ; i++) {
            ch_1=str.charAt(i);
            ch_2=str.charAt(i+1);
            a=ch_1-ch_2;
            System.out.print((ch_1)+""+a);

            }
        System.out.println(str.charAt(len-1));
        return;
        }
    }
