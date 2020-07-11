package Stacks;

public class Queue {
    private int[] ar;
    private int Default_size=10;
    private int end;
    private int front;
    public Queue(){
        this.ar=new int[Default_size];
        this.end=0;
        this.front=0;
    }
    public boolean isFull(){
        return end==ar.length;
    }
    public int front(){
        return ar[0];
    }

    public void insert(int element){
        if(isFull()){
            return;
        }
        ar[end++]=element;
    }
    public boolean isEmpty(){
        return end==0;
    }
    public int remove(){
        int temp=ar[0];
       // for (int i = 1; i < end; i++) {
         //   ar[i-1]=ar[i];
        //}
        front++;
        return temp;
    }
    public void display(){
        for (int i = front; i <end ; i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
}
