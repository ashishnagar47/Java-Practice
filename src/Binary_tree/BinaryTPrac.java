package Binary_tree;

import java.util.Scanner;

public class BinaryTPrac {
    private Node root;

    public class Node{
        int value;
        Node left;
        Node right;
        public Node(int value){
            this.value=value;
        }
    }

    public void takeInp(Scanner s){
        this.root=takeInp(root,s);
    }
        private Node takeInp(Node node,Scanner s){
        if(node==null){
            int value=Integer.parseInt(s.nextLine());
            Node node1=new Node(value);
            return node1;
        }
        System.out.println("Enter the dirxn");
        String dirxn=s.nextLine();
        if(dirxn.equals("left")){
            node.left=takeInp(node.left,s);
        }
        if(dirxn.equals("right")){
            node.right=takeInp(node.right,s);
        }
        return node;
    }


    public void display(){
        display(this.root,"");
    }
        private void display(Node node,String indent){
        if(node==null){
            return;
        }
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
        System.out.println(indent+node.value);
    }


    public Node findNode(int value){
        return findNode(value,root);
    }
        private Node findNode(int value,Node node){
        if(node==null){
            return null;
        }
        if(node.value==value){
            return node;
        }
        Node nodeL=findNode(value,node.left);
        Node nodeR=findNode(value,node.right);
        if(nodeL!=null){
            return nodeL;
        }
        else{
            return nodeR;
        }
    }


    public int Sum(){
        return Sum(root);
    }
        private int Sum(Node node){
        if (node == null) {
            return 0;
        }
        return node.value+Sum(node.left)+Sum(node.right);
    }

    public int height(){
        return height(root);
    }
        private int height(Node node){
            if(node==null){
                return 0;
            }
            return 1+Math.max(height(node.left),height(node.right));
    }

    public int minDepth(){
        return minDepth(root);
    }
    private int minDepth(Node node){
        if(node==null){
            return 0;
        }
        return 1+Math.min(minDepth(node.left),minDepth(node.right));

    }

    


    public static void main(String[] args) {
        BinaryTPrac tree=new BinaryTPrac();
        Scanner sc=new Scanner(System.in);
        tree.takeInp(sc);
        tree.takeInp(sc);
        tree.takeInp(sc);
        tree.takeInp(sc);
//        tree.takeInp(sc);
//        tree.takeInp(sc);
//        tree.takeInp(sc);
//        tree.takeInp(sc);
        //Node node=tree.findNode(3);
        //System.out.println(node.value);
        //System.out.println(tree.Sum());
        //System.out.println(tree.height());
        //System.out.println(tree.minDepth());
        tree.display();

    }
}
