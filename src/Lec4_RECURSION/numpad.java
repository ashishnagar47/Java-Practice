package Lec4_RECURSION;

import java.util.Scanner;

public class numpad {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        numPad(str,"");
    }
    public static void numPad(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;}
        char ch=unprocessed.charAt(0);
        int n=Integer.parseInt(String.valueOf(ch));
        //System.out.println(n);
        unprocessed=unprocessed.substring(1);
        for (int j = 3*(n-1); j <n*3; j++) {
            if(j==26){
                continue;
            }
            char ch1= (char) (j+'a');
            numPad(unprocessed,processed+ch1);
        }
    }
}
