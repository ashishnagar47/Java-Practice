package BitMasking;

import java.util.Scanner;

public class abPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = Integer.toBinaryString(n);
        int p = str.length();
        int count=0;
        System.out.println(func(n, p,count));
    }
        public static int func(int n,int p,int count) {
            if (n == 0) {
                return 1;
            }
           // int count=0;

            String binaryString = String.format("%" + Integer.toString(p) + "s", Integer.toBinaryString(n)).replace(" ", "0");
            //System.out.println(binaryString);
            for (int i = 0; i < p-1; i++) {
                if (binaryString.charAt(i) != '1' || binaryString.charAt(i + 1) == '1') {
                }
            }
            count+=func(n-1,p,count)+1;
            return count;

        }

}
