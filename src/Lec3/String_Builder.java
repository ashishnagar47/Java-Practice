package Lec3;

import java.sql.SQLOutput;

public class String_Builder {
    public static void main(String[] args) {
        String s="";

        StringBuilder builder=new StringBuilder(s);
        for (int i = 0; i<=10000000 ; i++) {
            builder.append('a');

        }
        System.out.print(builder);
    }

}
