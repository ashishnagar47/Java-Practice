package STRINGS;

import java.util.Scanner;

public class pallindrom_substring<i> {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int len1 = str.length();
        int count=0,k;
        for (int i = 0; i <= len1 - 1; i++) {
            for (int j =i+1;j<=len1;j++){
                String s_2=str.substring(i,j);
                int len=s_2.length();
                for(k=0;k<len/2;k++) {
                    if (s_2.charAt(k) != s_2.charAt(len - k-1)) {
                        break;
                    }
                }
                if(k==len/2){
                    count++;
                }


            }

        }
        System.out.println(count);

    }
}
