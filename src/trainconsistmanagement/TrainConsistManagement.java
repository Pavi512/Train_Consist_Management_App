package trainconsistmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistManagement {

    // Inner Bogie class
    static class Bogie {
        String type;
        String name;
        int capacity;

        public Bogie(String type, String name, int capacity) {
            this.type = type;
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return " Capacity -> " + capacity ;
        }
    }

    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println(" UC9 - Group Bogies by Type (Collectors.groupingBy)");
        System.out.println("==================================================\n");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", "Passenger", 72));
        bogies.add(new Bogie("AC Chair", "Passenger", 56));
        bogies.add(new Bogie("First Class", "Passenger", 24));
        bogies.add(new Bogie("Sleeper", "Goods", 70));
        bogies.add(new Bogie("AC Chair", "Goods", 60));

        System.out.println("All Bogies: ");
        for(Bogie bogie: bogies){
            System.out.println(bogie.type + " -> " + bogie.capacity);
        }

        // Group bogies by type
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        // Display grouped bogies
        System.out.println("\nGrouped Bogies:\n");

        for(Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()){
            System.out.println("Bogie Type: "+entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("   " + b);
            }
            System.out.println();
        }

        System.out.println("\nUC9 grouping completed.");
    }
}