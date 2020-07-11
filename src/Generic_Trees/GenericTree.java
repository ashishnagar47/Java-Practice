package Generic_Trees;

import java.util.ArrayList;
import java.util.Scanner;

public class GenericTree {
    private class Node{
        int data;
        ArrayList<Node> children;
        public Node(int data) {
            this.data = data;
            this.children = new ArrayList();
        }
    }
    private Node root;
    private int size;
    GenericTree(){
        Scanner s=new Scanner(System.in);
        this.root=takeInput(s,null,0);
    }
    public Node takeInput(Scanner s,Node parent,int ithChild){
        if(parent==null){
            System.out.println("Enter the data root node");
        }
        else{
            System.out.println("Enter the data for "+ithChild+"th child of"+parent.data);
        }
        int data=s.nextInt();
        Node node=new Node(data);
        size++;
        System.out.println("Enter the no. of children for "+data);
        int children=s.nextInt();
        for (int i = 0; i <children ; i++) {
            Node child=takeInput(s,node,i);
            node.children.add(child);

        }
        return node;
    }
    public void display(){
        this.display(root);
    }
    private void display(Node node){
        String str=node.data+"==>";
        for (int i = 0; i <node.children.size() ; i++) {
            str=str+node.children.get(i).data+", ";
        }
        str=str+"End";
        System.out.println(str);
        for (int i = 0; i < node.children.size(); i++) {
            display(node.children.get(i));
        }
    }
}
