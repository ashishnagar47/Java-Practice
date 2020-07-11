package Practice_loops;

import java.util.*;
public class Pattern_1 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        long n;
        n = 10000000;
        long rev=0,ans=0;
        int count=0;
        long a=0;
        long c=n,p=0;
        while(n>0){
            a=n%10;
            count+=1;
            rev=rev*10+a;
            n=n/10;
        }
        int f=count;
        while(count>0){
            if(count==f){
                a=rev%10;
                p=9-a;
                if(p==0){
                    ans=ans*10+a;
                }
                else if(p<a){
                    ans=ans*10+p;
                }
                else{
                    ans=ans*10+a;
                }
                rev=rev/10;
                count--;
            }
            else{
                a=rev%10;
                p=9-a;
                if(p<a){
                    ans=ans*10+p;
                }
                else{
                    ans=ans*10+a;
                }
                count-=1;
                rev=rev/10;
            }}

		/*while(ans>0){
			a=ans%10;
			rev=rev*10+a;
			ans=ans/10;
		}*/
        System.out.print(ans);
    }
    // Your Code Here
}
