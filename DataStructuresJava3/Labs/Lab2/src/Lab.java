/*
seven = seen
four = fur
expected outputs for the two above
 */
import java.util.Collections;
import java.util.Stack;
public class Lab {
    public static void remove_mid(Stack<Character> word, int letterLength) {
        Stack<Character> reverse = new Stack<>();
// If length of the word is even
        if (letterLength % 2 == 0) {
// var will be word length divided by 2, I can isolate the first half and then with the latter I can pop the middle
            int var = letterLength / 2;
            for (int i = 0; i < var; i++) {
                reverse.push(word.pop());
            }
//Now having successfully isolated the first half, I can pop the middle
            word.pop();
            while (!word.isEmpty()) {
                reverse.push(word.pop());
            }
            while (!reverse.isEmpty()) {
                System.out.print(reverse.pop());
            }
        // If the length of the word is odd
        } else {
            int var2 = Math.abs((letterLength)/2);
            for (int i = 0; i < var2; i++) {
                reverse.push(word.pop());
            }
            word.pop();
            while (!word.isEmpty()) {
                reverse.push(word.pop());
            }
            while (!reverse.isEmpty()) {
                System.out.print(reverse.pop());
            }
            //it works now
        }
    }

    public static void main(String[] args) {
        Stack<Character> word1 = new Stack<>();
        Stack<Character> word2 = new Stack<>();
        Collections.addAll(word1, 'f','o','u','r');
        Collections.addAll(word2, 's','e','v','e','n');
        int wordL1 = word1.size();
        int wordL2 = word2.size();
        remove_mid(word1, wordL1);
        System.out.println("\n-----");
        remove_mid(word2, wordL2);
    }
}