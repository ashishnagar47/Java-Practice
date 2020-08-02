package GFG_30days_of_coding.LinkedList;

import java.util.Scanner;

public class reverseLL {

    private Node root;
    private Node head;
    private Node tail;
    int size=0;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public void insertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int data){
        Node node=new Node(data);
        if(head==null){
           insertFirst(data);
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void reverse(){
        ReverseLinkedlist(head);
    }
    private Node ReverseLinkedlist(Node temp){
        Node ahead=null;
        Node prev=null;
        Node curr=temp;
        while(curr!=null){
            ahead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=ahead;
        }
        Node t=head.next;
        head=tail;
        tail=t;
        return head;
    }

    public void findMiddle(){
        middle(head);
    }
    private void middle(Node node){
        Node node_f=node;
        while(node_f.next!=null && node_f.next.next!=null){
            node=node.next;
            node_f=node_f.next.next;
        }
        System.out.println(node.data);
    }

    public reverseLL addTwoLL(reverseLL L1,reverseLL L2){
        L1.reverse();
        L2.reverse();
        reverseLL L=new reverseLL();
        Node t=L1.head;
        Node t1=L2.head;
        int c=0;
        while (t.next!=null && t1.next!=null){
           // System.out.println(t.data%10 +"=>"+ t1.data);
            int p=t.data+t1.data+c;
            c=p/10;
            int s=0;
            if(p>9){
                s=p%10;
            }
            else{
                s=p;
            }
            //System.out.println(s);
            L.insertFirst(s);
            t=t.next;
            t1=t1.next;
        }
        while (t.next!=null){
            L.insertLast(t.data);
            t=t.next;
        }
        while (t1.next!=null){
            L.insertLast(t1.data);
            t1=t1.next;
        }
        if(c>0){
            L.insertFirst(c);
        }
        //L.reverse();
        L.display();
        return L;
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+"=>");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        reverseLL rev=new reverseLL();
        reverseLL rev1=new reverseLL();
        reverseLL rev2=new reverseLL();
        rev.insertLast(9);
        rev.insertLast(2);
        rev.insertLast(3);
        rev.insertLast(4);
        rev1.insertLast(5);
        rev1.insertLast(6);
        rev1.insertLast(7);
        rev1.insertLast(8);

        rev2.addTwoLL(rev,rev1);
         // rev.display();
            //rev.reverse();
            //rev.display();
           // rev.findMiddle();

    }
}
