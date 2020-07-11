package BitMasking;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class checkOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();
        int count = 0;
        System.out.println(check_odd(n));
        swapping(x, y);
        System.out.println(check_set(n, count));
    }

    public static boolean check_odd(int n) {
        int ans = (n & 1);
        if (ans == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void swapping(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x);
        System.out.println(y);
    }

    public static int check_set(int n, int count) {
        while (n > 0) {
            if ((n & 1) == 1) {
                count += 1;
            }
            n = n >> 1;
        }
        return count;
    }
}

