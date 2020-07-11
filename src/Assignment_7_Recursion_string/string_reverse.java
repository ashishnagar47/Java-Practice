package Assignment_7_Recursion_string;

import java.util.Scanner;

public class string_reverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str_1=s.nextLine();
        String str_2=s.nextLine();
        int len=str_1.length();
        int i=0;
        System.out.println(check_pal(str_1,str_2,len,i));
    }
    public static boolean check_pal(String str_1,String str_2,int len,int i){
        if(i==len){
            return true;
        }
        if(str_1.charAt(i)!=str_2.charAt(len-i-1)) {
            return false;
        }
        return check_pal(str_1,str_2,len,i+1);
    }

}


