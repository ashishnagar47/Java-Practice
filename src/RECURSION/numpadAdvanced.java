package RECURSION;

import java.util.Scanner;

public class numpadAdvanced {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        numPad(str,"");


//        "abc".charAt()
    }
    public static void numPad(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;}
        char ch=unprocessed.charAt(0);
        int n = ch-'0';
        //System.out.println(n);
        //int n=Integer.parseInt(String.valueOf(ch));
        unprocessed=unprocessed.substring(1);

        if(n==0) {
            char ch1 = ' ';
            numPad(unprocessed, processed + ch1);
        }
        else if(n==1||n==7){
            for (int j=4*(n-3)-1; j <4*(n-2)-1 ; j++) {
                char c;
                if(j==-9){
                    c='.';
                    numPad(unprocessed,processed+c);
                }
                else if(j==-8){
                    c='+';
                    numPad(unprocessed,processed+c);
                }
                else if(j==-7){
                    c='@';
                    numPad(unprocessed,processed+c);
                }
                else if(j==-6){
                    c='$';
                    numPad(unprocessed,processed+c);}
                else{
                    c=(char)(j+'a');
                    numPad(unprocessed,processed+c);
                }

            }}
        else if(n==9){
            for (int i = 22; i <26 ; i++) {
                char c=(char)(i+'a');
                numPad(unprocessed,processed+c);
            }
        }
        else{
            if(n==8){
                for(int i=19;i<22;i++){
                    char ch1=(char)(i+'a');

                    numPad(unprocessed,processed+ch1);
                }
            }
            else{
                for (int i = 3*(n-2); i <3*(n-1); i++) {
                    char ch1= (char) (i+'a');
                    numPad(unprocessed,processed+ch1);
                }
            }

        }
    }
}
