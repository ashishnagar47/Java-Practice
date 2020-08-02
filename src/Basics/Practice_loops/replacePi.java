package Basics.Practice_loops;

import java.util.Scanner;

public class replacePi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //String str=s.nextLine();
        //int len=str.length();
        int a = Integer.parseInt(s.nextLine());

        for (int j = 0; j < a; j++) {
            String processed = "";
            String str = s.nextLine();
            replace_pi(str, processed);

        }
    }
        public static void replace_pi( String str,String processed){
            //Scanner s=new Scanner(System.in);
            //String str=s.nextLine();
            int len=str.length();
            float n= (float) 3.14;
            if(len>1){
                if(str.charAt(0)=='p' && str.charAt(1)=='i'){
                    processed=processed+n;
                    str=str.substring(2);
                    len=len-2;}
                else{
                    char ch=str.charAt(0);
                    processed=processed+ch;
                    str=str.substring(1);
                    len=len-1;
                }

            }
            if(len==1) {
                char ch = str.charAt(0);
                processed = processed + ch;
                str = str.substring(1);
                len = len - 1;
            }
            if(len<=0){
                System.out.println(processed);
                return ;
            }

             replace_pi(str,processed);
        }

    }


