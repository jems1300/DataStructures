import java.util.Collections;
import java.util.Stack;

public class Scratch {
    public static void main(String[] args)  {
        Stack<Character> word1 = new Stack<>();
        Stack<Character> word2 = new Stack<>();

        Collections.addAll(word1, 'f', 'o', 'u', 'r');
        Collections.addAll(word2, 's', 'e', 'v', 'e', 'n');

        int word1L = word1.size();
        int word2L = word2.size();

        remove_mid(word1, word1L);

    }

    public static void remove_mid(Stack <Character> word, int wordNum) {
        // My temporary empty stack
        Stack<Character> temp = new Stack<>();

        if (wordNum % 2 == 0) {
            int evenNum = wordNum / 2;
            for(int i=0; i<evenNum; i++) {
                temp.push(word.pop());
            }
            word.pop();

            while(!word.isEmpty()) {
                temp.push(word.pop());
            }
            while(!temp.isEmpty()) {
                System.out.print(temp.pop());
            }

        }
        else {
            int oddNum = Math.abs(wordNum / 2);
            System.out.println(oddNum);
        }

    }
}