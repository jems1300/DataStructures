import java.util.Objects;

public class HashTable {
    private Node[] table;
    private int capacity;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
    }

    public int hashCode(Integer key) {
        return key % capacity;
    }

    // Implement get method for lab assignment
    public String get(int index) {
        Node current = table[index];
        if (current == null) {
            return null;
        } else {
            return current.getData();
        }
    }

    // Implement put method for lab assignment
    public void put(Node n) {
        int hash = hashCode(n.getKey());
        Node head = table[hash];

        // if the slot is empty, insert it
        if (head == null) {
            table[hash] = n;
            return;
        }

        // vice versa if the slot is taken up, keep moving up.
        while (head != null) {
            if (head.getKey() == n.getKey()) {
                head.data = n.data;
                return;
            }

            if (head.next == null) {
                head.setNext(n);
                return;
            }
            head = head.getNext();
        }
    }

    public String toString() {
        String s = "[";
        String color;

        for (int index = 0; index < this.capacity - 1; index++) {
            color = table[index] == null ? null : this.get(index);
            s += color + ", ";

            if (index % 8 == 7) {
                s += "\n";
            }
        }

        color = table[this.capacity - 1] == null ? null :
                this.get(this.capacity - 1);
        s += color + "]";
        return s;
    }
}

class Node {
    Integer key;
    String data;
    Node next;

    public Node(Integer key, String data) {
        this.key = key;
        this.data = data;
        this.next = null;
    }

    public Integer getKey() {
        return key;
    }

    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}