package LinkedList;

import java.util.Scanner;

public class Linked_list {
    private Node head;
    private Node tail;
    private int size=0;
    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
        }
    }
    public void insertFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        Node node=new Node(value);
        if(head==null){
            insertFirst(value);
            return;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public int LastkthNode(int n){
        Node fast=head;
        Node slow=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        while(fast.value!=-1){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.value;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ==> ");
            temp = temp.next;
        }
    }
    public static void main(String args[]) {
        Linked_list list=new Linked_list();
        Scanner s=new Scanner(System.in);
        int n=0;
        while(n!=-1) {
            n = s.nextInt();
            list.insertLast(n);
        }
        //list.display();
        int k=s.nextInt();
        int m=list.LastkthNode(k);
        System.out.println(m);
        // Your Code Here
    }
}
