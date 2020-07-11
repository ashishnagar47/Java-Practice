package Binary_tree;

import java.util.Scanner;
import java.util.Queue;
import  java.util.LinkedList;
import java.util.Arrays;

public class BT {
    private Node root;

    public class Node {
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

   public void insert(Scanner s){
        this.root=insert(root,s);
    }
    private Node insert(Node node,Scanner s){
        if(node==null){
            int value=Integer.parseInt(s.nextLine());
            Node node1=new Node(value);
            return node1;
        }
        System.out.println("Enter the dirxn");
        String dir=s.nextLine();
        if(dir.equals("left")){
            node.left=insert(node.left,s);
        }
        else{
            node.right=insert(node.right,s);
        }
        return node;
    }

    public Node findNode(int value){
        return findNode(root,value);
    }
    private Node findNode(Node node,int value){
        if(node==null){
            return null;
        }
        if(node.value==value){
            return node;
        }
        Node node2=findNode(node.left,value);
        Node node3=findNode(node.right,value);
        if(node2!=null){
            return node2;
        }
        return node3;
    }

    public int sum(){
        return sum(root);
    }
    private int sum(Node node){
        if(node==null){
            return 0;
        }
        return node.value+sum(node.left)+sum(node.right);
    }

    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node==null){
            return 0;
        }
        int count=0;
        return 1+Math.max(height(node.left),height(node.right));

    }

    public void display(){
        display(this.root,"");
    }
         private void display(Node node,String indent){
            if(node==null){
                return;
            }//FOR PREORDER(Root,left,Right)
            //System.out.println(indent+node.value);
            display(node.left,indent+"\t");
            /*
            FOR INORDER(left,Root,Right)::
            System.out.println(indent+node.value);
             */
            display(node.right,indent+"\t");
            //
           // FOR POSTORDER(Left,Right,Root)::
            System.out.println(indent+node.value);
    }

    public int diameter(){
        return diameter(this.root);
    }
        private int diameter(Node node){
        if(node==null){
            return 0;
        }
        int current=1+height(node.left)+height(node.right);
        int max=Math.max(diameter(node.left),diameter(node.right));
        return Math.max(current,max);
    }

    public void levelOrder() {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList();
        queue.add(root);
        //int height=0;
        while (!queue.isEmpty()) {
            Node temp = queue.remove();
            System.out.println(temp.value);
            if (temp.left != null) {
                //System.out.println(height1(temp.left));
                queue.add(temp.left);
            }
            if (temp.right != null) {
               // System.out.println(height1(temp.right));
                queue.add(temp.right);
            }
        }
    }


    public void populatebyprein(int pre[],int in[]){
        this.root=populatebyprein(root,pre,in);
    }
    private Node populatebyprein(Node node,int[] pre,int[] in){
        if(in.length==0){
            return null;
        }

        int ele = pre[0];

        int index = find(in, ele);

            int preleft[] = Arrays.copyOfRange(pre, 1, index + 1);
            int preright[] = Arrays.copyOfRange(pre, index + 1, pre.length);
            int inleft[] = Arrays.copyOfRange(in, 0, index);
            int inright[] = Arrays.copyOfRange(in, index, in.length);

            Node node1 = new Node(ele);
            node1.left = populatebyprein(node1.left, preleft, inleft);
            node1.right = populatebyprein(node1.right, preright, inright);

        return node1;
    }

    public int find(int in[],int ele){
        for (int i = 0; i <in.length ; i++) {
            if(in[i]==ele){
                return i;
            }
        }
        return 0;
    }
    public int  height1(){
        return height1(this.root);
    }
    private int  height1(Node node){
        if(node==null){
            return 0;
        }
        return Math.max(height1(node.left),height1(node.right))+1;
    }

}
