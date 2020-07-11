package Sorting_Algorithms;
import java.util.Arrays;
public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={5,3,4,2,1};
        for (int i = 0; i <arr.length ; i++) {
            int max=maxindex(arr,1,arr.length-i-1);
            Swap(arr,max,arr.length-i-1);

        }
        System.out.println(Arrays.toString(arr));


    }
    public static int maxindex(int arr[],int start,int end){
        int max=0;
        for (int i =start; i <=end ; i++) {
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void  Swap(int arr[],int max,int len){
        int temp=arr[max];
        arr[max]=arr[len];
        arr[len]=temp;
        return;
    }
}
