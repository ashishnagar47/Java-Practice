import java.util.*;
public class Testing {
    //    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        long[] arr = new long[n];
//
//        for(int i_arr=0; i_arr<n; i_arr++)
//        {
//            arr[i_arr] = input.nextLong();
//        }
//
//        long out_ = minsum_and(arr, n);
//        System.out.println(out_);
//
//    }
//
//    static long minsum_and(long[] arr, int n){
//        long min=999999999;
//        int p=-1;
//        long[] a=new long[n];
//        for(int i=0;i<n;i++){
//            if(min>arr[i]){
//                min=arr[i];
//                p=i;
//            }
//        }
//        // a[0]=arr[p];
//        long temp=arr[0];
//        arr[0]=arr[p];
//        arr[p]=temp;
//        for(int i=1;i<n;i++){
//            long m=999999999;
//            int k=-1;
//            for(int j=0;j<n;j++){
//                if(i-1!=j){
//                    if((arr[i-1]&arr[j])<m){
//                        m=arr[i-1]&arr[j];
//                        k=j;
//                    }
//                }
//            }
//            long t=arr[i];
//            arr[i]=arr[k];
//            arr[k]=t;
//        }
//        long sum=0;
//        for(int i=0;i<n;i++){
//            long f=0;
//            for(int j=0;j<=i;j++){
//                if(j==0){
//                    f=arr[j];
//                }
//                else{
//                    f=f&arr[j];
//                }
//            }
//            sum=sum+f;
//        }
//        return sum;
//
//    }
//}
    public static void main(String args[]) throws Exception {
//    Scanner s=new Scanner(System.in);
//    int tc=Integer.parseInt(s.nextLine());
//    for(int i=0;i<tc;i++){
//        int n=Integer.parseInt(s.nextLine());
//        String str=s.nextLine();
//        int[] arr=new int[n];
//        for(int j=0;j<n;j++){
//            int p=Character.getNumericValue(str.charAt(j));
//            arr[j]=p;
//        }
//        System.out.println(streak(arr,n));
//    }
//}
//    public static int streak(int[] arr,int n){
//
//            int max=0;
//        for(int i=0;i<n;i++){
//            int count=0;
//            int c=0;
//            int j=0;
//                while(c!=2&&j<n){
//                    if(arr[j]==1){
//                        count++;
//                    }
//                    else if(c==1){
//                        c++;
//
//                    }
//                    else{
//                        c++;
//                        count++;
//                    }
//                    j++;
//                }
//                if(max<count){
//                    max=count;
//                }
//                break;
//            }
//
//        return max;
//    }
//}
//

//    int k = s.nextInt();
//    nums = twoSum(nums, k);
//    for (int i = 0; i <n ; i++) {
//        System.out.println(nums[i]);
//    }
//}
//    public static int[] twoSum(int[] nums, int target) { // egs: nums: 4, 4, 7, 6 target: 8
//        HashMap<Integer, Integer> remainder = new HashMap<Integer, Integer>();
//        for(int i=0; i< nums.length; i++) {
//            if(remainder.get(target - nums[i]) != null) {
//                /* For each element check if the number is already there; for first 4 hashmap is empty so 4, 0 is added. At next occurence of 4, you dont need to add to the hashmap but simply return. */
//                return new int[] {remainder.get(target - nums[i]), i};
//            }
//            remainder.put(nums[i],i);
//        }
//        return null;
//    }
//}
        //Scanner s = new Scanner(System.in);
        //int t = s.nextInt();
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(str);
        str=str.replaceAll("\\s+","");
        System.out.println(str);
        int[] arr = {1, 0, 0, 1, 0, 1};
        Arrays.sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
}
