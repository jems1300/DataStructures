import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10_000_000];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        linearsearch(array, 1, 2, 5000000, -10);

        binarysearch(array, 5000000, 7500000, 9997559, -10);
    }

    private static void linearsearch(int[] array, int... targets) {
        List<Integer> key = new ArrayList<>();

        for (int target : targets) {
            int indexFound = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    indexFound = i;
                    break;
                }
            }
            key.add(indexFound);
        }
        System.out.println("Linear Search");
        System.out.println(key+"\n");
    }

    private static void binarysearch(int[] array, int... targets) {
        List<Integer> key = new ArrayList<>();

        for (int target : targets) {
            int low = 0;
            int high = array.length - 1;

            int indexFound = -1;
            while (low <= high) {
                int middle = low + (high - low) / 2;
                int value = array[middle];

                if (value < target) {
                    low = middle + 1;
                } else if (value > target) {
                    high = middle - 1;
                } else {
                    indexFound = middle;
                    break;
                }
            }
            key.add(indexFound);
        }
        System.out.println("Binary Search");
        System.out.println(key);
    }

//    public static long AlgorithmA(int n) {
//        Long startTime;
//        Long endTime;
//        Long elapsedTime;
//
//        startTime = System.nanoTime();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum = sum + 1;
//        }
//
//        endTime = System.nanoTime();
//        elapsedTime = endTime - startTime;
//
//        return elapsedTime;
//    }

    /*
    I'm leaving a note here, it's unfinished and buggy. No excuse from me, I had plenty of time to get started early,
    but after i left work from this weekend i got sick with covid. I notified my profs and i was absent my classes.
    I tried catching up on my hw while i was mostly ill. I recovered today but after a 2nd test on 9/4/2025 i was still positive.
    I'm sorry this was in such a sorry state, i'll do better.
     */
}