package Practice_loops;

import java.util.Scanner;

public class xor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            int b=s.nextInt();
            xor(a,b,"");
        }
    }
    public static void xor(int a,int b,String processed){
        int num1,num2;
        String p="";
       while(a>0){
           num1=a%10;
           num2=b%10;
           int f=num1^num2;
           processed=processed+f;
           a=a/10;
           b=b/10;
       }
       int l=processed.length();
        for (int i = 0; i <processed.length() ; i++) {
            char ch=processed.charAt(l-1);
            p=p+ch;
            l--;
        }
        System.out.println(p);

    }
}

