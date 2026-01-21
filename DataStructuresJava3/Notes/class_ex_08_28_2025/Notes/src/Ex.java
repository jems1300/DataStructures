/*
2 approaches to searching an array/collection so basically
- if the list is **unsorted** <- Linear Search (locate 1, 2, 5000000, -10)
- if the list is **sorted** <- Binary Search < - Binary Search (locate 5000000, 7500000,9997559, -10)
    - Both will search through an int array, will return either a found or -1 if not found

- Construct an array with 10 million ints numbered 1 to 1000000

- Check the performance comparison between the two

 */

import java.util.Arrays;

public class Ex {

    static int search(int []million, int n, int x) {
    for (int i = 0; i < n; i++) {
        if (million[i] == x)
            return i;
    }
    return -1;
}

    public static void main(String[] args) {
        int[] million = new int[10_000_001];
        // all elements are in
        int n = million.length;

        int x = 1;

        int index = search(million, n, x);


        // loop that iterates from 0, 9,999,999
        for (int i = 0; i < million.length; i++) {
            million[i] = i + 1;
        }
//        System.out.println(Arrays.toString(million));
        if (index == -1)

            System.out.println("Element is not in the array");
        else System.out.println("Element is in the array" + index);



    }
}

