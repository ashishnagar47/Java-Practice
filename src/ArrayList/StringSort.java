package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n =Integer.parseInt(s.nextLine());
        ArrayList<String> list=new ArrayList();
        for (int i = 0; i <n; i++) {
            String str=s.nextLine();
            list.add(str);
        }
        Collections.sort(list);
        System.out.println(list);
    }

}
