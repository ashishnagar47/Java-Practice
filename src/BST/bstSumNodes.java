package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bstSumNodes {
    private Node root;

    private class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
        }
    }

    public void insert(int data) {
        this.root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }
        if (node.data > data) {
            node.left = insert(node.left, data);
        }
        if (node.data < data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    public void SumNode() {
        SumNode(root,0);
    }

    private void SumNode(Node node,int sum) {
        if (node == null) {
            return;
        }
        SumNode(node.right,sum);
        sum=sum+node.data;
        node.data=sum;

        SumNode(node.left,sum);
    }
    public void levelOrder(){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList();
        queue.add(root);

        while(!queue.isEmpty()){
            Node temp=queue.remove();
            System.out.println(temp.data);
            if(temp.left!=null){
                queue.add(root.left);
            }
             if(temp.right!=null){
                queue.add(root.right);
            }

        }
    }

    public static void main(String[] args) {
        bstSumNodes sum = new bstSumNodes();
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
        sum.levelOrder();

    }
}
