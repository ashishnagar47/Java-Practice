package Sorting_Algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.HashMap;
import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {

/*        int arr[] = {5, 4, 3, 2, 1};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion_sort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                else{
                    break;
                }
            }
        }
        return;
    }
}
*/
        Scanner s = new Scanner(System.in);
        int test = s.nextInt();

        ArrayList list=new ArrayList();
        for (int k = test; k > 0; k--) {
            int row = s.nextInt();
            int[] arr = new int[row];
            for (int i = 0; i < row; i++) {
                //   for(int j=0;j<row;j++){
                arr[i] = s.nextInt();
            }
            insertion_sort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }
        public static void insertion_sort( int arr[]){
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = i + 1; j > 0; j--) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    } else {
                        break;
                    }
                }
            }
            return;
        }
    }

