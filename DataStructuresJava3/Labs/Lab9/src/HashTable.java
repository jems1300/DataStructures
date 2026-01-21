class HashTable {
    private Node[] table;
    private int capacity;
    private int occupants;
    private final Node VACANT = new Node(-1, "N/A");

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = new Node[capacity];
        this.occupants = 0;
    }

    public int hashCode(Integer key) {
        return key % capacity;
    }

    public int doubleHash(Integer key, int i) {
        return (hashCode(key) + Math.abs(13 - key % 13) * i) % capacity;
    }

    public String get(Integer key) {
        int hash = hashCode(key);
        int count = 1;

        while(table[hash] != null && table[hash].getKey() != key) {
            hash = doubleHash(key, count);
            count++;
        }

        if (table[hash] == null) {
            return null;
        }

        return table[hash].getData();
    }

    // Update put method for removing and rehashing
    public void put(Node node) {
        if (this.occupants <= this.capacity * 0.80) {
            rehash();
        }

        if(node.getKey() != null) {
            int hash = hashCode(node.getKey());
            int count = 1;

            while(table[hash] != null) {
                hash = doubleHash(node.getKey(), count);
                count++;
            }

            table[hash] = node;
            this.occupants++;
        }
    }

    //
    // Implement remove method for in-class assignment
    public Node remove(Integer key) {
        int hash = hashCode(key);
        int count = 1;

        while (table[hash] != null && table[hash].getKey() != key) {
            hash = doubleHash(key, count);
            count++;
        }

        // If the key was never in the table, then this is the only point this if thing would activate
        if (table[hash] == null) {
            return null;
        }

        Node temp = table[hash];
        table[hash] = null;
        this.occupants--;
        return temp;

     }

    // Implement rehash method for lab assignment <-- More like resize* Basically expanding the table.
    public void rehash() {
        this.capacity *= 2; // <- We're gonna double our capacity
        Node old_table[] = table; // <- We're transferring the list
        this.occupants = 0; // <- to avoid resizing itself and a infinite loop.

        // Here we create our new table
        this.table = new Node[this.capacity];
        // for every item in the old table, put it in the new one.
        for (Node n : old_table) {
            this.put(n);
        }
    }

    public String toString() {
        String s = "[";
        String color;

        for (int index = 0; index < this.capacity - 1; index++) {
            color = table[index] == null ? null : table[index].getData();
            s += color + ", ";

            if (index % 10 == 9) {
                s += "\n";
            }
        }

        color = table[this.capacity - 1] == null ? null :
                table[this.capacity - 1].getData();
        s += color + "]";
        return s;
    }
}

class Node {
    Integer key;
    String data;

    public Node(Integer key, String data) {
        this.key = key;
        this.data = data;
    }

    public Integer getKey() {
        return key;
    }

    public String getData() {
        return data;
    }
}