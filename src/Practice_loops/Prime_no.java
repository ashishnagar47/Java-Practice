package Practice_loops;

import java.util.Scanner;

public class Prime_no {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n_1 = s.nextInt();
        int k, i, ans = 0, l;
        for (l = n_1; l > 0; l--) {
            int no = s.nextInt();
            int count = 0;
            for (i = 2; i <= 999999999; i++) {
                for (k = 2; k < i; k++) {
                    if (i % k == 0) {
                        break;
                    }
                }
                if (i == k) {
                    count += 1;
                    ans = i;
                }
                if (count == no) {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
