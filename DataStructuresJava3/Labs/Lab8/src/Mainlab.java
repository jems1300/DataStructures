//class Node {
//    public int data;
//    public Node next;
//
//    Node(int data) {
//        this.data = data;
//    }
//}
//public class Mainlab {
//    public static void main(String [] args) {
//        Node head = new Node(100);
//        Node node2 = new Node(500);
//        Node node3 = new Node(1000);
//        head.next = node2;
//        node2.next = node3;
//
//        // head.next -> node2 -> node2.next -> null
//        // To traverse a linked list
//        traverse(head);
//    }
//
//    // This is linearly going to traverse through each head in this linked list.
//    // Separate chaining is all about linked list.
//    public void traverse(Node head) {
//        Node current = head;
//        while (current != null) {
//            current = current.next;
//        }
//
//    }
//}
