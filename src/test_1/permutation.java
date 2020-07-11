package test_1;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a="abc";

        perm("abc","");
    }
    public static void perm(String unsigned,String signed){
        if(unsigned.isEmpty()){
            System.out.println(signed);
            return;
        }
        char ch=unsigned.charAt(0);
        unsigned=unsigned.substring(1);
        for(int i=0;i<=signed.length();i++){
            String first=signed.substring(0,i);
            String second=signed.substring(i);
            perm(unsigned,first+ch+second);
        }


    }
}
