import java.util.Stack;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Prepare the first stack with characters
        Stack<Character> word = new Stack<>();
        Collections.addAll(word, 'f', 'o', 'u', 'r');

        // Create a second stack to help reverse back
        Stack<Character> helper = new Stack<>();

        System.out.println(word);

        // Pop all characters from 'word' and push to 'helper' to reverse order
        while (!word.isEmpty()) {
            System.out.println(helper.push(word.pop()));
        }

        // Now pop from 'helper' and print to get original order
        while (!helper.isEmpty()) {
            System.out.print(helper.pop());
        }
    }
}