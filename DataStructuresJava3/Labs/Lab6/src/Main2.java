import java.util.ArrayList;
import java.util.HashMap;

class Name {
    private String firstName;
    private String lastName;

    // Constructor
    public Name (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        // returns useful information relevant to the class
        return this.firstName + " " + this.lastName;
    }

    // instead of other being a anynomous object,
    @Override
    public boolean equals (Object other) {
        String other_firstName = ((Name) other).getFirstName();
        String other_lastName = ((Name) other).getLastName();
        return this.firstName.equals(other_firstName) && this.lastName.equals(other_lastName);
    }

    @Override
    public int hashCode() {

        int sum = 0;
        for (Character c: (this.firstName + this.lastName).toCharArray()) {
            sum += c.hashCode();
        }
        return sum;

    }
}

public class Main2 {
    public static void main(String [] args) {
        Name name = new Name("First", "Last");
        Name name2 = new Name ("First2", "Last2");

        HashMap<Name, Character> map = new HashMap<>();
        map.put(name, 'A');
        map.put(name2, 'B');

        // Will call the hashcode function
        System.out.println(map.get(name)); // name's toString function

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(0);
        arrayList.add(1);

        // An O(1) -> O(n) because we had to internally adjust the size of our array.
        arrayList.add(2);

        // Amortized O(1)
        // HashMap's insertion: Amortized O(1)

    }
}
