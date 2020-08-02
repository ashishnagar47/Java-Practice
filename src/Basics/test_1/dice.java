package Basics.test_1;

import java.util.Scanner;

public class dice {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int unprocessed=n;
        System.out.println(dice_roll(n,unprocessed,""));

    }
    public static int dice_roll(int n,int unprocessed,String processed){
        if(unprocessed==0){
            System.out.println(processed);
            return 1;
        }
        int count=0;

        for (int i = 1; i<=6&&i <=unprocessed; i++) {
            count+=dice_roll(n,unprocessed-i,processed+i);

        }
        return count;

    }
}
