package Assignment_8a_Backtracking;

import java.util.Scanner;
import java.lang.Math;

public class towerOfHanoi {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        String p="";
        for(int i=0;i<n;i++){
            //arr[i]=s.nextInt();
            p=p+s.nextInt();
        }
        int[] arr1=new int[n];
        arr1=arr;
        int sum=s.nextInt();
        sum1(n,sum,p);
    }
    public static void sum1(int n,int sum,String p){
        int inum=-99999999;
        int arr[] =new int[p.length()];
        for(int i=0;i<n;i++){
            for (int j = 0; j <p.length() ; j++) {
                arr[j]=0;
            }
            for (int j = 0; j <p.length() ; j++) {
                 arr[j]=Character.getNumericValue(p.charAt(j));
            }
            for(int j=0;j<n;j++){
                for (int h = 0; h <p.length() ; h++) {
                    arr[h]=Character.getNumericValue(p.charAt(h));
                }
                for(int k=0;k<n;k++){
                    if((i!=j &&j!=k)&&(i!=k)){
                        if(arr[i]+arr[j]+arr[k]==sum){
                            if(arr[i]<arr[j]){
                                if(arr[j]<arr[k]){
                                    System.out.println(arr[i]+", "+arr[j]+" and "+arr[k]);
                                    arr[j]=inum;
                                    arr[k]=inum;
                                }
                                else if((arr[j]>arr[k])&&(arr[k]>arr[i])){
                                    System.out.println(arr[i]+", "+arr[k]+" and "+arr[j]);
                                    arr[j]=inum;
                                    arr[k]=inum;
                                }
                            }

                            else if(arr[i]>arr[j]){
                                if(arr[k]>arr[i]){
                                    System.out.println(arr[j]+", "+arr[i]+" and "+arr[k]);
                                    arr[i]=inum;
                                    arr[k]=inum;
                                }
                                else if((arr[i]>arr[k])&&(arr[k]>arr[j])){
                                    System.out.println(arr[j]+", "+arr[k]+" and "+arr[i]);
                                    arr[i]=inum;
                                    arr[k]=inum;
                                }
							else if(arr[i]>arr[k]){
                                    if(arr[j]>arr[i]){
                                        System.out.println(arr[k]+", "+arr[i]+" and "+arr[j]);
                                        arr[j]=inum;
                                        arr[i]=inum;
                                    }
                                    else if((arr[i]>arr[j])&&(arr[j]>arr[k])){
                                        System.out.println(arr[k]+", "+arr[j]+" and "+arr[i]);
                                        arr[j]=inum;
                                        arr[i]=inum;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
