package Array;

import java.util.Scanner;

public class kThroot {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        for (int i = 0; i <n ; i++) {
//            long k=s.nextLong();
//            int t=s.nextInt();
//            System.out.println(kthRoot(k,t));
//        }
//    }
//    public static int kthRoot(long k,int t){
//        long a=0;
//        int i=0;
//        while(k>=a){
//
//            a= (long) Math.pow(i,t);
//            i++;
//        }
//        return i-2;
//    }
//}

        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String processed = "";
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    processed = processed + str1.charAt(i);
                    str1 = str1.substring(i+1);
                    break;
                }
            }
            str1 = str1.substring(i+1);
        }
        System.out.println(processed);
    }
}