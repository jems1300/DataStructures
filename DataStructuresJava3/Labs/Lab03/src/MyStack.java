import java.util.ArrayList;

public class MyStack implements Stack {
    private ArrayList <Integer> array = new ArrayList<>();

    public void push(Integer n) {
        array.add(n);
    }

    public Integer pop() {
        return array.remove(0);
    }

    public Integer peek() {
        return array.get(0);
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }
}
