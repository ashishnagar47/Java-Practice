package Heap;

public class HeapClient {
    public static void main(String[] args) throws Exception {
        Heaps heap = new Heaps();
        heap.add(4);
        heap.add(1);
        heap.add(2);
        heap.delete();
        heap.display();
    }

}
