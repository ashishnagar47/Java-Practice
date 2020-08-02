package STRINGS;

import java.util.Scanner;

public class Min_indexed_char {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        for (int k = 0; k < n; k++) {
            String str1 = s.nextLine();
            String str2 = s.nextLine();
            min_index(str1, str2);
        }
    }

    public static void min_index(String str1, String str2) {
        int i, j;
        for (i = 0; i < str1.length() ; i++) {
            for (j = 0; j < str2.length() ; j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    System.out.println(str1.charAt(i));
                    return;
                }
            }
        }
        if (i == str1.length()) {
            System.out.println("No character present");
        }
    }
}
