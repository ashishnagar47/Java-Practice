package ForLoop;
//
//import java.util.Scanner;
//
//public class binary_decimal {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int no;
//        int rem;
//        for(int i=1;i<=n;i++){
//            int deci=0;
//            int place=1;
//            no=s.nextInt();
//            while(no>0){
//                rem=no%10;
//                deci=deci+rem*place;
//                place=place*2;
//                no=no/10;
//            }
//            System.out.println(deci);
//
//        }
//
//    }
//}

import java.util.*;

public class binary_decimal{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int p=s.nextInt();
            System.out.println(deci(p));
        }
    }
    public  static int deci(int a){
        int p=1,b=0,m=0;
        while(a>0){
            m=b;
            b=a%10;

            b=b*p+m;
            p=p*2;
            a=a/10;
        }
        return b;
    }
}
