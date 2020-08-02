package RECURSION;

public class bubble_sort_rec {
    public static void main(String[] args) {
        int a[] = {5, 4, 3, 2, 1};
        int row = 4;
        int col = 0;
        int len=a.length;
        b_s(a,row,col);
    }
    public static void b_s(int arr[],int row,int col){
        int temp;
        if(row==0){
            for (int i = 0; i <arr.length;i++){
                System.out.print(arr[i]);
            }
            return;
        }
        if(col==row) {
            b_s(arr, row - 1, 0);
            return;
        }

        if(arr[col]>arr[col+1]) {
            temp = arr[col];
            arr[col] = arr[col + 1];
            arr[col + 1] = temp;
        }
        b_s(arr,row,col+1);


    }
}
