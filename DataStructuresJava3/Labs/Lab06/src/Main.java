//import java.util.*;
//
//public class Main {
//    // A dict is a correspond list of keys and values storage.
//    // Also known as Dict, HashMap, Map <--> Built on Arrays YOU'LL NEVER GET AWAY FROM LINKED LISTS!
//    public static void main(String[] args) {
//
//        // in between the <>, you get to decide what kind of type it is
//        HashMap<Integer, Character> map = new HashMap<>();
//        map.put(0, 'A');
//        // {0 : 'A'}
//
//        // Values can be whatever, Keys are the important factor since they are the associated value
//        // we actually want to grab
//
//        map.put(20, 'B');
//        // {0 : 'A', 20 : "B"}
//
//        // Query:
//        Character c = map.get(0); // -> A
//        Character c2 = map.get(20); // -> B
//        map.get(5); // -> null : We would get an out of index error
//
//        // A set is just a list of items
//        // set = {1, 2, 3}
//        // setB = {1, 4, 5, 6}
//        // set (UNION) setB
//        // = {1, 2, 3, 4, 5, 6}
//        // set (INTERSECTION setB
//        // = {1}
//
//        // Loops through keys
//        for (Integer i : map.keySet()) {
//            System.out.println(i);
//        }
//
//        // Loops through values
//        for (Character c: map.values()) {
//            System.out.println(c);
//        }
//
//        // size, contains
//        map.size();
//        map.containsKey(0);
//        map.containsValue('B'); // -> boolean
//
//        // clears everything from the dict
//        map.clear();
//
////        map.remove(0);
////        map.remove(20);
//        // {}
//
//
//    }
//}