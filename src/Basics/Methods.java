package Basics;

public class Methods {
    public static void main(String[] args) {
        int start=0,l=200,st=20;
        f_c(start,l,st);
    }
    public static void f_c(int start,int l,int st){
        float c;
        while(start<=l){

            c=(float)5*(start-32)/9;
            System.out.println(start+"==>"+c);
            start=start+st;
        }
        
    }
}
