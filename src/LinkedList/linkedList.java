package LinkedList;

public class linkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
       // node.next=null;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (size == 0) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);

        tail.next = node;
        tail = node;
        size++;
    }

    public int deletefirst() {
        if (size == 0) {
            System.out.println("Empty linked list");
        }
        head = head.next;
        size--;
        return head.value;
    }

    public int deletelast() {
        if (size < 2) {
            deletefirst();
        }
        Node temp = head;
        if (size == 0) {
            System.out.println("Empty");
        }
        while (temp.next != tail) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = null;
        size--;
        return value;
    }

    public Node get(int index) {
        Node temp = head;
        if (size == 0) {
            System.out.println("Empty");
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void insertinBtw(int index, int value) {
        if (index == 0) {
            insertFirst(value);
        }
        if (index == size) {
            insertLast(value);
            return;
        }
        Node temp = get(index - 1);
        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;

    }

    public int deletebetween(int index) {
        if (index == 0) {
            return deletefirst();
        }
        if (index == size - 1) {
            return deletelast();
        }
        Node temp = get(index - 1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public int valueAt(int value) {
        Node temp = head;
        int index = 0;
        while (temp.value != value) {
            temp = temp.next;
            index += 1;
        }
        return index;
    }

    public void shift(int value) {
        Node temp = head;
        Node t = head;
        while (temp.next.value != value) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        tail.next = t;
    }

    public void eliminateDuplicate() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.value == temp.next.value) {
                temp = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ==> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse() {
        Node temp = head;
        reverse(temp);
    }

    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private Node Reverse(Node node) {
       // Node h=head;
        Node temp = head;
        Node prev = null;
        Node ahead = null;
        //linkedList L1 = new linkedList();
       // int count = 0;
        int size=0;
        while (temp != null ) {
            ahead = temp.next;
            temp.next = prev;
            prev = temp;
            temp = ahead;
            //count++;

        }
        Node t=head;
        head=tail;
        tail=t;
        return tail;
    }

    public void Reverse(){
        int count =1;
        Reverse(head);
    }

//    private void kreverse(Node node,int k){
//        if(node==tail){
//            return;
//        }
//        kreverse(node.next,k,count+1);
//
//    }



    public linkedList oddEven(linkedList L1) {
        linkedList odd = new linkedList();
        linkedList even = new linkedList();
        Node temp = L1.head;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                even.insertLast(temp.value);
            } else {
                odd.insertLast(temp.value);
            }
            temp = temp.next;
        }
        odd.tail.next=even.head;
        odd.tail=even.tail;
        return odd;
    }

    public void oddEven1() {
            Node odd_head = null;
            Node odd_tail = null;
            Node even_head = null;
            Node even_tail = null;
            Node temp = head;
            while (temp != null) {
                if (temp.value % 2 == 0) {
                    if (even_head == null) {
                        even_head = temp;
                        even_tail = temp;
                    } else {
                        even_tail.next = temp;
                        even_tail = temp;
                    }
                } else {
                    if (odd_head == null) {
                        odd_head = temp;
                        odd_tail = temp;
                    } else {
                        odd_tail.next = temp;
                        odd_tail = temp;
                    }
                }
                temp = temp.next;
            }
            odd_tail.next = even_head;
            head = odd_head;
            tail = even_tail;
            tail.next = null;
    }

public Node midValue(){

    Node temp=head;
    Node temp1=head;

    while(temp1.next!=null && temp1.next.next!=null){

        temp=temp.next;
        temp1=temp1.next.next;
    }

    return temp;
}
    
    public linkedList mergesort(linkedList L1){

            if(L1.size==1){
                return L1;
            }
            linkedList first=new linkedList();
            Node mid=L1.midValue();
            first.head=L1.head;
            first.tail=mid;
            first.size=(L1.size+1)/2;

            linkedList second=new linkedList();
            second.head=mid.next;
            second.tail=L1.tail;
            second.size=(L1.size)/2;
            first.tail.next=null;
            first=mergesort(first);
            second=mergesort(second);
            return mergeSort(first,second);
    }

    public linkedList mergeSort(linkedList L1, linkedList L2) {
        L1.display();
        L2.display();
        linkedList list = new linkedList();
        Node First = L1.head;
        Node Second = L2.head;
        while (First != null && Second != null) {
            if (First.value < Second.value) {
                list.insertLast(First.value);
                First = First.next;
            } else {
                list.insertLast(Second.value);
                Second = Second.next;
            }
        }
        while (First != null) {
            list.insertLast(First.value);
            First = First.next;
        }
        while (Second != null) {
            list.insertLast(Second.value);
            Second = Second.next;
        }
        return list;

    }
    public int kthFromlast(int index){
        Node fast=head;
        Node slow=head;
        for (int i = 0; i <index ; i++) {
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.value;
    }
}
