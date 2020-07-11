package Stacks;

public class circularQueue {
    private int[] ar;
    private int Default_size = 10;
    private int end;
    private int front;
    private int size;

    public circularQueue() {
        this.ar = new int[Default_size];
        this.end = 0;
        this.front = 0;
        this.size = 0;
    }

    public boolean isFull() {
        return size == ar.length;
    }

    public int front() {
        return ar[0];
    }

    public void insert(int element) {
        if (isFull()) {
            return;
        }
        ar[end++] = element;
        end = end % ar.length;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int remove() {
        int temp = ar[front];
        front = front % ar.length;
        front++;
        size--;
        return temp;
    }

    public void display() {
        for (int i = 0; i <size; i++) {
            System.out.print(ar[(front+i)%ar.length]+" ");
        }
        System.out.println();
        }
    }


