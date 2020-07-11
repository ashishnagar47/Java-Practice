package ArraysGFG;

import java.util.Scanner;

public class FindDuplicate {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr={1,2,9,1,3,6,9};
        int size=arr.length;
        duplicate( arr,size);
    }
    public  static void duplicate(int[] arr,int size){
        int i;
        int[] a=new int[200000];
        for(i=0;i<size;i++){
            if(a[arr[i]]>0){
                System.out.println(arr[i]);
            }
            else{
                a[arr[i]]++;
            }
        }
    }
}
