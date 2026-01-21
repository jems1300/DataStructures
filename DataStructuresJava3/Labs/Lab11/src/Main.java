public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.add(new Node(4));
        queue.add(new Node(7));
        queue.add(new Node(10));
        queue.add(new Node(1));
        queue.add(new Node(2));
        queue.add(new Node(3));

        queue.printQueue();

    }
}