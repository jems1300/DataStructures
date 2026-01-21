public class Node {
    private int priority = -1;


    Node(int priority) {
        this.priority = priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return this.priority;
    }

}
