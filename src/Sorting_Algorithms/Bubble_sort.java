package Sorting_Algorithms;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bubble_sort {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int arr[]={5,4,3,2,1};
//        bubble(arr);
//     //   System.out.println(Array.toString(arr));
//
//    }
//    public static void bubble(int ar[]){
//        for (int i = 0; i <ar.length; i++) {
//            for (int j = 0; j <ar.length-i-1; j++) {
//                if(ar[j]>ar[j+1]){
//                    int temp=ar[j];
//                    ar[j]=ar[j+1];
//                    ar[j+1]=temp;
//                }
//            }
//        }
//        for (int i = 0; i <ar.length ; i++) {
//            System.out.println(ar[i]);
//        }
//    }
//
//}
public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

    // Write your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}
