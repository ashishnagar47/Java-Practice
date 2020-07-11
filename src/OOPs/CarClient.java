package OOPs;

import java.util.Scanner;

public class CarClient {
    public static void main(String[] args) {
        CAR engine=new petrolEngine();
        engine.start();
        engine.stop();
        engine.accelerate();
        engine.speed();
        Scanner s=new Scanner(System.in);
      //  int arr[]={1,2,3,4};
        sum(1,2,3,4,5,6);
    }
    public static void sum(int s,int ...arr){
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        }
    }

