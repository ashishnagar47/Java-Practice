package TreesPractice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ZigZagBinaryTree {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        ZigZagBinaryTree m = new ZigZagBinaryTree();
        BinaryTree bt = m.new BinaryTree();
        bt.levelOrderZZ();
    }

    private class BinaryTree {
        private class Node {
            int data;
            Node left;
            Node right;
        }

        private Node root;
        private int size;

        public BinaryTree() {
            this.root = this.takeInput(null, false);
        }

        public Node takeInput(Node parent, boolean ilc) {

            int cdata = scn.nextInt();
            Node child = new Node();
            child.data = cdata;
            this.size++;

            // left
            boolean hlc = scn.nextBoolean();

            if (hlc) {
                child.left = this.takeInput(child, true);
            }

            // right
            boolean hrc = scn.nextBoolean();

            if (hrc) {
                child.right = this.takeInput(child, false);
            }

            // return
            return child;
        }

        public void levelOrderZZ() {
            levelOrderZZ(root);
            // write your code here
        }
        private void levelOrderZZ(Node node){
            if(node ==null){
                return;
            }
            Stack<Node> stack1=new Stack<>();
            Stack<Node> stack2=new Stack<>();
            stack1.push(node);
            while( !stack1.isEmpty()|| !stack2.isEmpty()){
                while(!stack1.isEmpty()) {
                    Node temp = stack1.pop();
                    System.out.print(temp.data+" ");
                    if (temp.left != null) {
                        stack2.push(temp.left);
                    }
                    if (temp.right != null) {
                        stack2.push(temp.right);
                    }

                }
                //System.out.println();

                while(!stack2.isEmpty()){
                     Node temp=stack2.pop();
                    System.out.print(temp.data+" ");
                    if(temp.right!=null){
                        stack1.push(temp.right);
                    }
                    if(temp.left!=null){
                        stack1.push(temp.left);
                    }

                }
                //System.out.println();
            }

        }

    }

}

