package Basics.test_1;

import java.util.ArrayList;
import java.util.Scanner;

public class maize {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
        System.out.println(maze(x,y,""));
       // System.out.println(maze1(x,y,""));
    }
    public static int maze(int x,int y,String processed){
        if(x==1&&y==1){
            System.out.println(processed);
            return 1;
        }
        int count=0;
        if(x>0){
             count+=maze(x-1,y,processed+"R");

        }
        if(y>0) {
             count+=maze(x, y - 1, processed+"C");

        }
        return count;
    }
    public static ArrayList maze1(int x, int y, String processed){
        if(x==1&&y==1){
            ArrayList list=new ArrayList();
            System.out.println(processed);

            return list;
        }
        ArrayList list=new ArrayList();
      //  int count=0;
        if(x>0){
            list.addAll(maze1(x-1,y,processed+"R"));

        }
        if(y>0) {
            list.addAll(maze1(x, y - 1, processed+"C"));

        }
        return list;
    }
}
