package Stacks;

import java.util.Stack;

public class Stack_Client {
    public static void main(String[] args) throws Exception{
        Stacks stack=new Stacks();

        for (int i = 0; i <9 ; i++) {
            stack.push(i);
        }
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(stack.pop());
            }
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        finally{
         //   for (int i = 0; i < 15; i++) {
           //     stack.pop();
            //}
            System.out.println();
        }
    }
}
