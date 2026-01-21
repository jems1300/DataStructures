import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirName = scanner.next();
        // String dirName = "test";

        File file = new File(dirName);

        if (!file.exists()) {
            System.out.println("Directory does not exist.");
            return;
        }

        if (!file.isDirectory()) {
            System.out.println("Input is not a directory." );
            return;
        }

        // For our lab, we can use this template (not required)

        // file -> isDirectory, exists
        // for every file f in this directory/array of files
        for (File f : file.listFiles()) {
            if (f.isDirectory()) {
                System.out.print("Directory: ");
            } else {
                System.out.print("File: ");
            }
            System.out.println(f.getName());
        }
    }
}