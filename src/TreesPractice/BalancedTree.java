package TreesPractice;

import Generic_Trees.GenericTree;

import java.util.*;
import java.util.Scanner;

public class BalancedTree {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        BalancedTree m = new BalancedTree();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.isBalanced());
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

        public boolean isBalanced() {
            if(isBalanced(this.root)!=null){
                return false;
            }
            return true;
        }

        private Node isBalanced(Node node) {
            boolean a;
            if (node == null) {
                return null;
            }
            if ((height(node.left) - height(node.right) > 1) || (height(node.left) - height(node.right) < -1)) {
                return node.left;
            }
            Node node2=isBalanced(node.left);
            Node node3=isBalanced(node.right);
            if(node2!=null){
                return node2;
            }
            return node3;


            // write your code here
        }

        private int height(Node node) {
            if (node == null) {
                return 0;
            }
            return Math.max(height(node.left), height(node.right));
        }
//        private class BalancedPair {
//            int height;
//            boolean isBalanced;
//        }
    }

}
