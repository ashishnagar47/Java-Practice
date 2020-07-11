package Binary_tree;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Str {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        Str m = new Str();
        BinaryTree bt = m.new BinaryTree();
        System.out.println(bt.levelOrderZZ());
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

        public ArrayList levelOrderZZ() {

            ArrayList result=new ArrayList();
            if(root==null){
                return result;
            }
            Queue<Node> queue=new LinkedList();
            queue.add(root);
            //int size=0;

            while(!queue.isEmpty()) {
                ArrayList list=new ArrayList();
                int size1=queue.size();

                for (int i = 0; i <size1 ; i++) {
                    Node temp = queue.remove();
                    list.add(temp.data);

                //System.out.println(temp.data);
                    if (temp.left != null) {
                        queue.add(temp.left);
                    }
                    if (temp.right != null) {
                        queue.add(temp.right);
                    }}
                 result.add(list);

                size++;
            }
        return result;
            // write your code here
        }
        public int height(){
            return height(this.root);
        }
        private int height(Node node){
            if(node==null){
                return 0;
            }
            return 1+Math.max(height(node.left),height(node.right));
        }

    }

}
