package BitMasking;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

import static java.lang.StrictMath.pow;

public class magical_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0, place = 1;
        n_magical_no(n, res, place);
    }

    public static void n_magical_no(int n, int res, int place) {
        for (int i = 0; i < n; i++) {
            int no=i;
            while (no > 0) {
                if ((no & 1) == 1) {
                    res = res+(int)pow(5, place);

                }
                no = no >> 1;
                place++;
                System.out.println(res);
            }
            place=1;

        }
    }
}


