import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Node> queue = new ArrayList<>();

    PriorityQueue() {}

    PriorityQueue(ArrayList<Node> nodes) {
        this.queue = nodes;

        for (int i = queue.size() / 2 - 1; i >= 0; i--) {
            heapify(queue, i);
        }
    }

    public void add(Node node) {
        queue.add(node);

        int index = queue.size() - 1;
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (queue.get(index).getPriority() > queue.get(parent).getPriority()) {
                Node temp = queue.get(index);
                queue.set(index, queue.get(parent));
                queue.set(parent, temp);
                index = parent;
            } else {
                break;
            }
        }
    }

    public Node remove() {
        if (queue.isEmpty()) return null;

        Node removed = queue.get(0);

        Node last = queue.remove(queue.size() - 1);
        if (!queue.isEmpty()) {
            queue.set(0, last);
            heapify(queue, 0);
        }

        return removed;
    }

    public void heapify(ArrayList<Node> list, int index) {
        int size = list.size();

        while (true) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;

            // check left
            if (left < size &&
                    list.get(left).getPriority() > list.get(largest).getPriority()) {
                largest = left;
            }
            // check right
            if (right < size &&
                    list.get(right).getPriority() > list.get(largest).getPriority()) {
                largest = right;
            }
            if (largest == index) break;

            // swap
            Node temp = list.get(index);
            list.set(index, list.get(largest));
            list.set(largest, temp);

            index = largest;
        }
    }

    private void insertionSort() {
        for (int i = 1; i < queue.size(); i++) {
            Node n = queue.get(i);

            int insertionIndex = i - 1;
            while (insertionIndex >= 0 &&
                    n.getPriority() > queue.get(insertionIndex).getPriority()) {

                queue.set(insertionIndex + 1, queue.get(insertionIndex));
                insertionIndex--;
            }

            queue.set(insertionIndex + 1, n);
        }
    }

    public void printQueue() {
        insertionSort();
        for (Node n : queue) {
            System.out.println(n.getPriority());
        }
    }
}
