package TreesPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bst_SumNodes {
    private Node root;
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){

            this.data=data;
        }
    }

    public void insert(int data){
         this.root=insert(root,data);
    }
    private Node insert(Node node,int data){
        if(node==null){
            return new Node(data);
        }
        if(node.data>data){
            node.left=insert(node.left,data);
        }
        if(node.data<data){
            node.right=insert(node.right,data);
        }
        return node;
    }

    public void SumNode(){
        SumNode(root);
    }
    private void SumNode(Node node){

        if(node==null){
            return ;
        }
        Queue<Node> queue=new LinkedList();
        queue.add(node);
        while(true){
            int count=queue.size();
            if(count==0){
                break;
            }
            while(count>0){
                Node temp=queue.remove();
                System.out.print(Sum(root,temp)+" ");
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
                count--;
            }
            System.out.println();
        }
    }
    private int Sum(Node node,Node temp){
        if(node==null){
            return 0;
        }
        int sum=0;
        if(node.data>temp.data){
            sum+=node.data;
        }
        sum+=Sum(node.left,temp);
        sum+=Sum(node.right,temp);
        return sum;
    }

    public static void main(String[] args) {
        Bst_SumNodes sum=new Bst_SumNodes();
        Scanner s = new Scanner(System.in);
        // int n=s.nextInt();
        while (true) {
            int n = s.nextInt();
            if (n > -1) {
                sum.insert(n);
            } else {
                break;
            }
        }
        sum.SumNode();
    }
}



