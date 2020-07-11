package Stacks;

public class QueueClient {
    public static void main(String[] args) {
        circularQueue queue = new circularQueue();
        for (int i = 1; i < 11; i++) {
            queue.insert(i);
            queue.display();

        }
        for (int i = 0; i <5 ; i++) {
            queue.remove();
            queue.display();
        }
        for (int i = 0; i <4 ; i++) {
            queue.insert(8-i);
            queue.display();
        }
    }
}
