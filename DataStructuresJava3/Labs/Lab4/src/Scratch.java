import java.util.*;

public class Scratch {
    public static void main(String[] args) {
        int interval = 30;
        Queue <Integer> process = new LinkedList<>(); // collection of processing times
        int [] units = {0, 0, 0};

        for (int i = 0; i < 50; i++) {
            int nano = (int) (Math.random() * (5)+1);
            Collections.addAll(process, nano);
        }

        while (interval > 0) {
            interval--;

            for (int i = 0; i < units.length; i++ ) {
            // units[i] is the value
            // i is the index
                if (units[i] > 0) {
                    units[i]--;
                }
                if (units[i] == 0 && !process.isEmpty()) {
                    units[i] = process.poll();
                    System.out.println("Transferring process with processing time of " + units[i] + " to resource " + i+"\n");
                }
                System.out.println("Current process in resource " + i + " has " + units[i] + " seconds left");
            }

        }


    }
}