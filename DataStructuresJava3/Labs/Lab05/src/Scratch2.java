import java.util.ArrayList;
import java.util.Collections;

public class Scratch2 {
    public static void main(String[] args) {
        ArrayList<Integer> unsort = new ArrayList<>();
        ArrayList<Integer> sort = new ArrayList<>();
        Collections.addAll(unsort, 9, 1, 5, 6, 8, 2);

        for (int i = 0; i < unsort.size(); i++) {
            int value = unsort.get(i);
            int insertIndex = 0;

            while (insertIndex < sort.size() && value > sort.get(insertIndex)) {
                insertIndex++;
            }
            sort.add(insertIndex, value);
        }

        System.out.println(sort);
    }
}

//        for (int i = 0; i < buffer.size(); i++) {
//            Packet index = buffer.get(i);
//            int value = index.getPosition();
//
//            int insert = 0;
//
//            while(insert < memory.size() && value > memory.get(insert).getPosition()) {
//                insert++;
//            }
//            memory.add(insert, index);
//    }
//}

//Packet packet = buffer.remove(0);
