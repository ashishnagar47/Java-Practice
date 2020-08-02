package RECURSION.Assignment_7_Recursion_string;

import java.util.Scanner;

public class check_string_pallindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int i=0;
        System.out.println(perm(str,i));
    }
    public static boolean perm(String str,int i){
        if(i==str.length()){
            return true;
        }
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            return false;
        }
        return perm(str,i+1);
    }
}
