package trainconsistmanagement;

import java.util.LinkedHashSet;
import java.util.Set;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("===========================================");
        System.out.println(" UC5 - Preserve insertion order of Bogies ");
        System.out.println("===========================================");
        System.out.println();

        // Create LinkedHashSet to remove duplicates and maintain insertion order
        Set<String> formation = new LinkedHashSet<>();

        // Add bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate bogie
        formation.add("Sleeper");

        System.out.println("Final Train Formation: ");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and ignores duplicate automatically.");

        System.out.println("\nUC5 formation setup completed.");
    }
}
