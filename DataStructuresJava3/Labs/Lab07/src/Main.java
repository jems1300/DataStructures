// how to deal with collisions, we can use probing
// Collisions are basically errors when assigning several keys to the same value. We need to prevent that

//fixed size array
class HashTable {
    private int capacity;
    private Integer[] array;

    // constructor
    HashTable(int capacity) {
        array = new Integer[capacity]; // array is initialized but it's null atm
        this.capacity = capacity;
    }

    private int hashCode(int k) {
        return k % this.capacity;
    }    // This will sort based on the remainder of K in the proper index


    public void put(int k) {
        int hash = hashCode(k);
        int count = 1;
        int quad = 0;

        while (array[hash] != null && array[hash] != k) {
            quad += count * count;
            hash = (hash + quad) % capacity;
            count++;
        }
        if(array[hash] == null) array[hash] = k;

        // keep looping until we find something that is not an empty space
//        while (array[hash] != null) {
//            hash = (hash + 1) & capacity;
//        }
//        this.array[hash] = k;

        /*
         basically what linear probing is, but there is a potential problem with this approach.
         -> if the entire table is full, then it will keep looping indefinitely
        */

        // So let's do one for quadratic probing -->>>
//        for (int i = 0; i < array.length; i++) {
//            if (array[hash] != null) {
//                hash = (hash + 1) & capacity;
//            } else {
//                hash = (hash + i * i) % this.capacity;
//            }
//            this.array[hash] = k;
//        }
    }

    public Integer get(int k) {

        int hash = hashCode(k);
        int count = 1;
        int quad = 0;

        while (array[hash] != null && array[hash] != k) {
            quad += count * count;
            hash = (hash + quad) % capacity;
            count++;
            if (count > capacity) return null;

        }
        return array[hash];
    }


    //
    @Override
    public String toString() {
        String n = "[";
        for (Integer k : this.array) {
            n += k + ", ";
        }
        n += "]";
        return n;
    }
}
public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);

        table.put(0);
        table.put(1);
        table.put(2);
        table.put(3);
        table.put(4);
        table.put(10);
        table.put(9);
        table.put(19);

        System.out.println(table);
        System.out.println(table.get(9));
        System.out.println(table.get(10));
        System.out.println(table.get(11));
        // [0, 1, 2, 3, 4] <- expected output

        table.get(5); // returns said key associated value
    }
}
/*
 for quadratic probing, the only functions we're going to really modify are the get and put functions for our Lab7.
 basically just figure out how to implement the quadratic code. The second part is to actually compare the
 differences between linear probing and quadratic probing and write out the reasoning why I think it's either
 slower/faster.
 */