import java.util.Scanner;

public class inbuilFunctions {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=Integer.parseInt(str);
        //to convert string to integer
        char ch=str.charAt(0);
        int m=Character.getNumericValue(ch);
        //to convert char to integer
        int p=Integer.parseInt(s.nextLine());
        //used before taking p strings using for loop
        String str1 = "Hello I'm your String";
        String[] splitStr = str1.split("\\s+");
        System.out.println(splitStr[2]);

    }
}

