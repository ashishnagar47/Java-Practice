package Basics;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic_equation {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int D;
        int root_1, root_2;
        D = (b * b) - 4 * (a * c);
        if (D > 0) {
            System.out.println("Real and Distinct");
        } else if (D == 0) {
            System.out.println("Real and Equal");
        } else {
            System.out.println("Real and Distinct");
        }
        root_1 = (int) ((-b + sqrt(D)) / 2 * a);
        root_2 = (int) ((-b - sqrt(D)) / 2 * a);
        if (root_1 > root_2) {
            System.out.print(root_2 + " " + root_1);
        } else {
            System.out.print(root_1 + " " + root_2);
        }
    }
}
