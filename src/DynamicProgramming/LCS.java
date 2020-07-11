package DynamicProgramming;

import java.util.Scanner;

public class LCS {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String p="";
        System.out.println(LCSdp(str1,str2));

    }

    public static int LCSdp(String str1,String str2) {
        if (str1.length() == 0 || str2.length() == 0) {
            return 0;
        }
        char f = str1.charAt(0);
        char s = str2.charAt(0);
        if (f == s) {

            return 1 + LCSdp(str1.substring(1), str2.substring(1));
        } else {
            return Math.max(LCSdp(str1.substring(1), str2), LCSdp(str1, str2.substring(1)));
        }
    }
}
