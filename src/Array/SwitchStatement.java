package Array;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c;

        while (true) {
            char ch = s.next().charAt(0);
            switch (ch) {
                case '+':
                    a = s.nextInt();
                    b = s.nextInt();
                    c = a + b;
                    System.out.println(c);
                    break;
                //ch=s.next().charAt(0);

                case '-':
                    a = s.nextInt();
                    b = s.nextInt();
                    c = a - b;
                    System.out.println(c);
                    break;
                    //ch = s.next().charAt(0);

                case '*':
                    a = s.nextInt();
                    b = s.nextInt();
                    c = a * b;
                    System.out.println(c);
                    break;

                case '/':
                    float v = s.nextFloat();
                    float w= s.nextInt();
                    float p=((float)(v)/w);
                    System.out.println(p);
                    break;
                    //ch = s.next().charAt(0);

                case '%':
                    a = s.nextInt();
                    b = s.nextInt();
                    c = a % b;
                    System.out.println(c);
                    break;
                   // ch = s.next().charAt(0);

                case 'X':
                    return;
                case 'x':
                    return;


                default:
                    System.out.println("Invalid Operator. Try again.");
                    break;
                    //ch = s.next().charAt(0);
            }
//            if(ch=='X'){
//                break;
//            }
//            if(ch=='x'){
//                break;
//            }
        }
    }

}
