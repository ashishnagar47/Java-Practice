package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Array_list {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(5);
        list.add(10);
        list.add("hell0");
        System.out.println(list.get(0));
        System.out.println(list.indexOf(5));
        list.set(1,8);
        System.out.println(list);
    }
}
