import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

    // instead of other being an anonymous object,
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

class TelephoneDirectory {
    private Map<Name, String> phoneBook;

    public TelephoneDirectory() {
        this.phoneBook = new HashMap<>();
    }

    public void readFile(Scanner data) {

        while(data.hasNextLine()) {
            String line = data.nextLine(); // read the entire line
            String[] parts = line.split(" "); // We'll split line by the spaces so it's easier to manipulate
            String firstName = parts[0];
            String lastName = parts[1];
            String phoneNum = parts[2];
            // since the names and phone # in the txt have the same format, we'll separate them into different parts
            // parts[2] will be for phone # respectively since it's always placed in last.
            Name name = new Name(firstName, lastName);

            phoneBook.put(name, phoneNum);

        }

    }

    public void writeFile(PrintWriter output) {
        // review this one again, might not work as intended
        for(Map.Entry<Name, String> entry : phoneBook.entrySet()) {
            output.write(entry.getKey() + " " + entry.getValue());
            output.write("\n");
        }
        output.close();
    }

    // our getters
    public String getPhoneNumber(Name person) {
        return phoneBook.get(person);
    }

    public String getPhoneBook() {

        String book = "";
        for (Map.Entry<Name, String> entry : phoneBook.entrySet()) {
            book += entry.getValue() + " " + entry.getKey() + "\n";
        }
        return book;
    }

    public void addPhoneNumber(Name personName, String phoneNumber) {
        phoneBook.put(personName, phoneNumber);
    }

    public void removePhoneNumber(Name personName) {
        phoneBook.remove(personName);
    }
}


