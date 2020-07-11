package BitMasking;
import java.util.Scanner;
public class find_unique_no {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //int n=s.nextInt();
//        int[] arr=new int[n];
//        for (int i = 0; i <n; i++) {
//            arr[i]=s.nextInt();
//        }
        //int no = 0;
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int unique=get_unique(arr,0);
        find_unique(unique,arr);
    }
    public static int get_unique(int arr[],int no){
        for (int i = 0; i <arr.length ; i++) {
             no=no^arr[i];
        }
        return no;
    }
    public static void find_unique(int unique,int arr[]){
        int no=0;
        int n=unique;
        int i=0,set=0;
        if((n&1)==1){
            set=i;
        }
        else{
            n=n>>1;
            i+=1;
        }
        for (int j = 0; j <arr.length; j++) {
             no=arr[j];
            if((no>>set)==1){
                no=unique^no;
            }
        }
        System.out.println(no);
        no=no^unique;
        System.out.println(no);
    }
}
