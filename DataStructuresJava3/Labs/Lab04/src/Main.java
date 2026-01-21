import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // We initiate the queue
        Scanner scanner = new Scanner(System.in);
        // Create a scanner to take input


        System.out.print("Enter task: ");
        String line = scanner.nextLine(); // Equivalent to input in Python

        // Keep the loop going until user inputs done
        while (!line.equals("done")) {
            queue.add(line);
            line = scanner.nextLine();
        }

        // After user enters done, then we're going to
        // continuously empty out the list until it's empty
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

    int interval = 30;

}


// We're going to use queue to simulate a scheduling system.

/* Explain the difference between singly linked list and
doubly linked list in your own words to see if you understand it
* */