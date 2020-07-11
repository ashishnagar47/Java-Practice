package BitMasking;

import java.util.ArrayList;
import java.util.Scanner;

public class SieveMethod {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        boolean[] prime = new boolean[1000001];
        int t = s.nextInt();


        while (t-- > 0){

            int f=s.nextInt();
            int l=s.nextInt();
            sieve(prime);
            ArrayList<Integer> list = new ArrayList<>();
            int count=0;
            for (int i = f; i < l; i++) {
                if(!prime[i]){
                    count++;
                    //list.add(i);
                }
            }
            //int n = s.nextInt();
            System.out.println(count);
        }
    }

    public static void sieve(boolean[] prime){
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i < prime.length; i++) {
            if (!prime[i]){
                for (int j = 2*i; j < prime.length; j+=i) {
                    prime[j] = true;
                }
            }
        }
    }
}