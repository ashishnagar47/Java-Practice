package Stacks;

import java.util.Scanner;

public class Stacks {
        private int DEFAULT_SIZE=10;
        private int[] ar;
        private int top;
        public Stacks(){
            this.ar=new int[DEFAULT_SIZE];
            this.top=0;
        }
        public boolean isfull(){
            return top==ar.length;
        }
        public void push(int element){
            if(isfull()){
                System.out.println("Stack is full");
                return;
            }
            ar[top++]=element;
        }
        public boolean isempty(){
         //   System.out.println("empty");
            return top==0;
        }
        public int pop() throws Exception{
            if(isempty()){
                throw new Exception("khali h");
              //  System.out.println("empty");
            //    return -1;
            }
            int temp=ar[--top];
           // top--;
            return temp;
        }
      //  public int top(){
        //    return top;
        //}
}
