package trainconsistmanagement;

import java.util.LinkedList;

public class TrainConsistManagement {
    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC4 - Maintain ordered bogie consist ");
        System.out.println("========================================");

        //LinkedList to maintain insertion order
        LinkedList<String> consist = new LinkedList<>();

        // Add bogies
        consist.addLast("Engine");
        consist.addLast("Sleeper");
        consist.addLast("AC");
        consist.addLast("Cargo");
        consist.addLast("Guard");

        System.out.println("Initial Train Consist: ");
        System.out.println(consist);

        // Insert Pantry Car at position 2
        consist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting Pantry Car: ");
        System.out.println(consist);

        // Remove first bogie
        consist.removeFirst();

        // Remove last bogie
        consist.removeLast();

        System.out.println("\nFinal Train Consist: ");
        System.out.println(consist);

        System.out.println("\nUC4 Ordered consist operations completed.");
    }
}
