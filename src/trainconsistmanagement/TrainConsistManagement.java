package trainconsistmanagement;

import java.util.Set;
import java.util.HashSet;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("========================================");

        //HashSet to store unique ids
        Set<String> bogies = new HashSet<String>();

        //Insert bogie IDs
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate IDs
        bogies.add("BG101");
        bogies.add("BG102");

        System.out.println("Bogies after Insertion: ");
        System.out.println(bogies);

        System.out.println("Note: ");
        System.out.println("Duplicates are automatically ignored by HashSet");

        System.out.println("UC3 uniqueness validation completed");

    }
}
