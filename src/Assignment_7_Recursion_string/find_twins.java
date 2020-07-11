package Assignment_7_Recursion_string;

import java.util.Scanner;

public class find_twins {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int twins=0;
        int i=0;
        System.out.println(twin(str,twins,i));
    }
    public static int twin(String str,int twins,int i){
        if(i>=str.length()-2){
            return twins;
        }
        if(str.charAt(i)==str.charAt(i+2)){
            twins+=1;
        }
        return twin(str,twins,i+1);
    }
}
