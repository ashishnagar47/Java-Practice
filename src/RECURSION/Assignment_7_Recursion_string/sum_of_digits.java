package RECURSION.Assignment_7_Recursion_string;

import java.util.Scanner;

public class sum_of_digits
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    //    String str=s.nextLine();
        String str="1123";
        int i=0;
        int sum_1=0;
        int len=str.length();
        System.out.println(sum(str,1,sum_1,len));
    }
    public  static int sum(String str,int i,int sum_1,int n){
        if (i>n){
            return sum_1;
        }
        char c=str.charAt(0);
        str=str.substring(1);
        sum_1=sum_1+Integer.parseInt(String.valueOf(c));
        return sum(str,i+1,sum_1,n);
    }
}
