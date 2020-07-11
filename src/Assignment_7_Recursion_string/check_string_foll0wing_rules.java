/*. Take as input str, a string. Write a recursive function that checks if the string was
        generated using the following rules and returns a Boolean value:
        a. the string begins with an 'a'
        b. each 'a' is followed by nothing or an 'a' or "bb"
        c. each "bb" is followed by nothing or an 'a'
        Print the value returned.

 */

package Assignment_7_Recursion_string;

import java.util.Scanner;

public class check_string_foll0wing_rules {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int i=1;
        System.out.println(check(str,i));
    }
    public static boolean check(String str,int i){
        boolean ans=false;
        if(i>=str.length()-2){
            return ans;
        }

        if((str.charAt(i)=='a')&&(str.charAt(i+1)=='a'||str.charAt(i+1)=='b')){
            ans=true;
            return ans;
        }

        return check(str,i+1);

    }
}
