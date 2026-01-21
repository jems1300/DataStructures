import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Scratch {
    public static void main(String[] args) {

        ArrayList<Integer> unsorted = new ArrayList<>();
        ArrayList<Integer> sorted = new ArrayList<>(); // Empty
        Collections.addAll(unsorted, 7, 2, 5, 1, 8, 6);

        for (int i = 0; i < unsorted.size(); i++) {
            int value = unsorted.get(i);
            int insertIndex = 0;

            while (insertIndex < sorted.size() && value > sorted.get(insertIndex)){
                insertIndex ++;
                // some logic
            }
            sorted.add(insertIndex, value);
        }
        System.out.println(sorted);
    }
}