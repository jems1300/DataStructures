public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable(10);

        // Insert several values, including some collisions
        table.put(new Node(0, "red"));
        table.put(new Node(1, "blue"));
        table.put(new Node(2, "green"));
        table.put(new Node(3, "yellow"));
        table.put(new Node(10, "orange"));
        table.put(new Node(9, "purple"));
        table.put(new Node(19, "brown"));
        table.put(new Node(5, "teal"));
        table.put(new Node(15, "magenta"));
        table.put(new Node(25, "cyan"));

        System.out.println(table);
        System.out.println(table.get(1));
        System.out.println(table.get(9));
        System.out.println(table.get(5));

    }
}