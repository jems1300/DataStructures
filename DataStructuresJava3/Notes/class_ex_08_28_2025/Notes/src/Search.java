import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Search {
    public static void main(String[] args) {
        int [] array = new int [10_000_000];

        for(int i=0; i < array.length; i++) {
            array[i] = i + 1;
        }


        linearsearch(array, 1, 2, 5000000, -10);

    }

    private static void linearsearch(int[] array, int... targets) {
        List <Integer> key = new ArrayList<>();

        for(int target : targets) {
            int keyFound = -1;
            for(int i=0; i < array.length; i++) {
                if(target == array[i]){
                    keyFound = i;
                    break;
                }
            }

            key.add(keyFound);
        }
        System.out.println(key);
    }
}
