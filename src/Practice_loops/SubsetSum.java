package Practice_loops;

import java.util.Scanner;

public class SubsetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       // String str=s.nextLine();
        for (int i = 0; i < n; i++) {
            int len=s.nextInt();
            String str=s.nextLine();
            str=s.nextLine();
            subset(str,"");
        }
    }
    public static void subset(String unprocessed,String processed){
        if(unprocessed.isEmpty()){
            int a=0;
            int b=0;
            System.out.println(processed);
            for(int i=0;i<processed.length();i++) {
                b = Character.getNumericValue(processed.charAt(i));
                a = b + a;
            }
            if(a==0) {
                System.out.println("yes");
            }
            else {
                System.out.println("No");
            }
                return;
        }
        char ch=unprocessed.charAt(0);
        subset(unprocessed.substring(1),processed+ch);
        subset(unprocessed.substring(1),processed);
    }
    }
