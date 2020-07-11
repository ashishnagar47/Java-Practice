package DynamicProgramming;

import java.util.Scanner;

public class DiceCount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] mem = new int[n + 1];
        System.out.println(Dicecount(n));
        System.out.println(DiceDpCount(n, mem));
        System.out.println(DiceDpItr(n,mem));


    }

    public static int Dicecount(int target) {
        if (target == 0) {
            // System.out.println(processed);
            return 1;
        }
        int count = 0;

        for (int i = 1; i <= 6 && i <= target; i++) {
            count += Dicecount(target - i);

        }
        return count;

    }

    public static int DiceDpCount(int target, int[] mem) {
        if (target == 0) {
            return 1;
        }
        if (mem[target] != 0) {
            return mem[target];
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            count += DiceDpCount(target - i, mem);
        }
        return count;
    }

    public static int DiceDpItr(int target,int mem[]){
        mem[0]=1;

        for (int i = 1; i <=target ; i++) {
            for (int j = 1; j <=6 &&j<=i ; j++) {
                mem[i]=mem[i]+mem[i-j];
            }
        }
        return mem[target];
    }


}
