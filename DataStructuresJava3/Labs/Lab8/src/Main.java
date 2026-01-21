class HashTable {
    private int capacity;
    private Node[] table;

    //Constructor
    HashTable(int capacity) {
        this.capacity = capacity;
        table = new Node[capacity];
    }

    public int hashCode(int key) {
        return key % this.capacity; // Same thing as -> h(k) = k % m
    }

    public int doubleHash(int key, int i) {
        return ((hashCode(key) + (7 - (hashCode(key) % 7))) * i) % this.capacity;

    }


    public void put(Node n) {
        // First hash:
        int hash = hashCode(n.getKey());

        int i = 0; // <- counts
        while (table[hash] != null) {
            // Second hash (stride)
            hash = doubleHash(n.getKey(), i);
            i++;
        }

        table[hash] = n;
    }

    public Node get(int key) {
        int hash = hashCode(key);

        int i = 0; // <- counts
        while (table[hash] != null) {
            // Second hash (stride)
            hash = doubleHash(key, i);
            i++;
        }

        return table[hash];
    }

}

class Node {
    private int key;
    private String value;

    Node(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return this.key;
    }

    public String getValue() {
        return this.value;
    }
}

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(14);
        Node node1 = new Node(18, "purple");
        table.put(node1);
    }
}

// Our lab deals with separate chaining.