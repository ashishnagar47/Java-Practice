package Assignment_5_STRINGS;

import java.util.Scanner;

public class pallindrome_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int len=s1.length();
        int i;
        for(i=0;i<len/2;i++) {
            if (s1.charAt(i) != s1.charAt(len - i-1)) {
                System.out.print("False");
                return;
            }
        }
        if(i==len/2){
            System.out.println("True");
        }

    }
}
