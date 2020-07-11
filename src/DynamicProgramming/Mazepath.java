package DynamicProgramming;

public class Mazepath {
    public static void main(String[] args) {
        int[][] mem=new int[4][4];
        System.out.println(mazepath(3,3));
        System.out.println(mazepathDpRec(3,3,mem));
        System.out.println(mazepathDpItr(3,3,mem));
    }

    public static int mazepath(int row,int col){
        if(row==1 || col==1){
            return 1;
        }
        return mazepath(row-1,col)+mazepath(row,col-1);
    }

    public static int mazepathDpRec(int row,int col,int[][] mem){
        if(row==1 || col==1){
            return 1;
        }
        if(mem[row][col]!=0){
            return mem[row][col];
        }
        int count=0;
        count+=mazepathDpRec(row-1,col,mem)+mazepathDpRec(row,col-1,mem);
        return count;
    }

    public static int mazepathDpItr(int row,int col,int[][] mem){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1 || j==1){
                    mem[i][j]=1;
                }
                else{
                    mem[i][j]=mem[i-1][j]+mem[i][j-1];
                }
            }

        }
        return mem[row][col];
    }
}
