/*
                2                               LEVEL 0     SUM=2
               / \
              1   3                             LEVEL 1     SUM=4
             /     /\
            4     6  8                          LEVEL 2     SUM=18
 */


package Binary_tree;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    Scanner s=new Scanner(System.in);

    private class tree{
    private class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
        private Node root;

    public tree(){
        this.root=insert(null);
    }
    private Node insert(Node node){
        int data=s.nextInt();
        Node child=new Node(data);
        int c=s.nextInt();
        if(c>0){
            child.left=insert(child.left);
        }
        if(c>1){
            child.right=insert(child.right);
        }
        return child;
    }

    public int height(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.max(height(node.left),height(node.right));
    }

    public int sumAtlvlK(int k){
        return sumAtlvlK(root,k);
    }
    private int sumAtlvlK(Node node,int k){
        if(height(node)==0){
            return 0;
        }
        int sum=0;
        int p=height(root);
       if(p-height(node)==k){
           sum+=node.data;
       }
        sum+=sumAtlvlK(node.left,k);
        sum+=sumAtlvlK(node.right,k);
        return sum;

    }}

    public static void main(String[] args) {
        Main sk=new Main();
        tree Tree=sk.new tree();
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println(Tree.sumAtlvlK(p));
    }
}